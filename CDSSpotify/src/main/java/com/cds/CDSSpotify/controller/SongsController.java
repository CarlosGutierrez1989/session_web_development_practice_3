package com.cds.CDSSpotify.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cds.CDSSpotify.model.Artist;
import com.cds.CDSSpotify.model.Song;
import com.cds.CDSSpotify.model.SongAux;
import com.cds.CDSSpotify.model.User;
import com.cds.CDSSpotify.repository.ArtistRepository;
import com.cds.CDSSpotify.repository.SongRepository;
import com.cds.CDSSpotify.utils.Utils;


@RequestMapping("/songs")
@Controller
public class SongsController {

	@Autowired
	private SongRepository songRepository;
	
	@Autowired
	private ArtistRepository artistRepository;

	private static final Logger logger = LoggerFactory.getLogger(SongsController.class);
	
	@GetMapping("")
	public String songs(HttpSession session, Model model) {
		if(!Utils.checkUserIsLog(session)) {
			return "redirect:/login";
		}
		
		User userLog = (User) session.getAttribute("userLog");
		List<Song> songs = songRepository.findAll();
		
		model.addAttribute("userLog", userLog);
		model.addAttribute("songs", songs);
		model.addAttribute("song", songs.get(0));
		return "songs";
	}
	
	@GetMapping("/addSong")
	public String addSong(HttpSession session, Model model) {
		if(!Utils.checkUserIsLog(session)) {
			return "redirect:/login";
		}
		
		model.addAttribute(new Song());
		
		User userLog = (User) session.getAttribute("userLog");
		List<Song> songs = songRepository.findAll();
		List<Artist> artists = artistRepository.findAll();

		
		model.addAttribute("userLog", userLog);
		model.addAttribute("songs", songs);
		model.addAttribute("artists", artists);
		
		return "addSong";
	}
	

	@PostMapping("/addSong/add")
	public ResponseEntity<?> addSongPost(@RequestBody SongAux songAux, HttpSession session, Model model) {
		
		List<Artist> artistList = new ArrayList<Artist>();
		for (String artistid : songAux.getArtists()) {
			artistList.add(artistRepository.findById(artistid).get());
		}
		
		Song song = new Song();
		song.setName(songAux.getName());
		song.setRelease_date(songAux.getRelease_date());
		song.setDuration_ms(songAux.getDuration_ms());
		song.setExternal_url(songAux.getExternal_url());
		song.setImage(songAux.getImage());
		song.setLike(false);
		song.setPopularity("0");
		song.setArtists(artistList);
		
		Song songResponse = songRepository.save(song);
		
		if(songResponse == null) {
			return ResponseEntity.badRequest().body(songAux);
		}
		return ResponseEntity.ok().body(song);
	}
	
	@GetMapping("/addSong/addArtist")
	public String addArtist(HttpSession session, Model model) {
		if(!Utils.checkUserIsLog(session)) {
			return "redirect:/login";
		}
		
		model.addAttribute(new Artist());
		
		User userLog = (User) session.getAttribute("userLog");
		model.addAttribute("userLog", userLog);

		return "addArtist";
	}
	
	@PostMapping("/addSong/addArtist/add")
	public ResponseEntity<?> addArtistPost(@RequestBody Artist artist, HttpSession session, Model model) {

		
		if( artistRepository.findByName(artist.getName()) != null ) {
			return ResponseEntity.badRequest().body(artist.getName() + " already registered.");
		}
		
		Artist artistResponse = artistRepository.save(artist);
		
		if(artistResponse == null) {
			return ResponseEntity.badRequest().body(artist);
		}
		
		return ResponseEntity.ok().body(artistResponse);
	}
	
	
	@GetMapping("/getSongById/{id}")
	public ResponseEntity<?> getSongById(@PathVariable String id, HttpSession session, Model model) {

		Song song = songRepository.findById(id).get();
		if(song == null) {
			return ResponseEntity.ok().body("ID " + id + " not found.");
		}
		return ResponseEntity.ok().body(song);
	}
	
	
	
	@GetMapping("/likeSongById/{id}")
	public ResponseEntity<?> likeSongById(@PathVariable String id, HttpSession session, Model model) {

		Song song = songRepository.findById(id).get();
		if(song == null) {
			return ResponseEntity.ok().body("ID " + id + " not found.");
		}
		
		if(song.isLike()) {
			song.setLike(false);
		}else {
			song.setLike(true);
		}
		
		song = songRepository.save(song);
		
		if(song == null) {
			return ResponseEntity.ok().body("Failed update object.");
		}
		
		return ResponseEntity.ok().body(song);
	}
	
	
}
