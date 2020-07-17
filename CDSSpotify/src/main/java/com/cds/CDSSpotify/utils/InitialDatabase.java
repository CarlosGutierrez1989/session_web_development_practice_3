package com.cds.CDSSpotify.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.cds.CDSSpotify.model.Artist;
import com.cds.CDSSpotify.model.Song;
import com.cds.CDSSpotify.model.User;
import com.cds.CDSSpotify.repository.ArtistRepository;
import com.cds.CDSSpotify.repository.SongRepository;
import com.cds.CDSSpotify.repository.UserRepository;

@Configuration
public class InitialDatabase {

	@Autowired
	SongRepository songRepository;

	@Autowired
	ArtistRepository artistRepository;

	@Autowired
	UserRepository userRepository;

	@PostConstruct
	public void pupulateData() {

		if (artistRepository.findAll().isEmpty()) {
			artists();
		}

		if (songRepository.findAll().isEmpty()) {
			songs2();
		}

		if (userRepository.findAll().isEmpty()) {
			users();
		}

	}

	private void users() {
		userRepository.save(new User("user3", "1234", "user3@email.com"));
		userRepository.save(new User("user1", "1234", "user1@email.com"));
		userRepository.save(new User("user2", "1234", "user2@email.com"));
	}

	private void songs2() {
		List<Song> artistmap = new ArrayList<Song>();

		List<Artist> arstist;

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Ozuna"));
		artistmap.add(new Song("Caramelo", "https://open.spotify.com/track/3gD4J3RUHy4OUuZ3qAiaiG",
				"https://i.scdn.co/image/ab67616d0000b2734122095eaf28b98e4d0ad4ae", "2020-06-11", "217546", "87",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Nio Garcia"));
		arstist.add(artistRepository.findByName("Anuel AA"));
		arstist.add(artistRepository.findByName("Myke Towers"));
		arstist.add(artistRepository.findByName("Brray"));
		arstist.add(artistRepository.findByName("Juanka"));
		artistmap.add(new Song("La Jeepeta - Remix", "https://open.spotify.com/track/1mohfLaTJtB2RplHLQVM70",
				"https://i.scdn.co/image/ab67616d0000b2735a89169ff864c80931b2b073", "2020-04-24", "345240", "91",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Anuel AA"));
		artistmap.add(new Song("El Manual", "https://open.spotify.com/track/7kOf0qHO4Rcwk6QJifZDRJ",
				"https://i.scdn.co/image/ab67616d0000b2733cb695bfc1246bdf66161fce", "2020-05-29", "210623", "82",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Prince Royce"));
		arstist.add(artistRepository.findByName("Myke Towers"));
		artistmap.add(new Song("Carita de Inocente (feat. Myke Towers) - Remix",
				"https://open.spotify.com/track/5kQre7o8ky5DXeEPcyaCR1",
				"https://i.scdn.co/image/ab67616d0000b2730ff4283736306e4d63308926", "2020-06-01", "192698", "80",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Anuel AA"));
		arstist.add(artistRepository.findByName("Bad Bunny"));
		artistmap.add(new Song("Hasta Que Dios Diga", "https://open.spotify.com/track/06s3QtMJVXw1AJX3UfvZG1",
				"https://i.scdn.co/image/ab67616d0000b2733cb695bfc1246bdf66161fce", "2020-05-29", "246000", "90",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Jay Wheeler"));
		arstist.add(artistRepository.findByName("DJ Nelson"));
		arstist.add(artistRepository.findByName("Myke Towers"));
		artistmap.add(new Song("La Curiosidad", "https://open.spotify.com/track/4HYDUMY0xSpeBr0AMY9cUz",
				"https://i.scdn.co/image/ab67616d0000b273509c45194c1ef6c1cb509e5d", "2020-06-12", "219048", "83",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Don Patricio"));
		arstist.add(artistRepository.findByName("Mozart La Para"));
		artistmap.add(new Song("Pa toda la vida (feat. Mozart La Para)",
				"https://open.spotify.com/track/6DDb7XRNUzeHmSoTbw5nmm",
				"https://i.scdn.co/image/ab67616d0000b2732c6d6570ead03ccfd72f93a0", "2020-05-22", "212330", "76",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Justin Quiles"));
		arstist.add(artistRepository.findByName("Daddy Yankee"));
		arstist.add(artistRepository.findByName("El Alfa"));
		artistmap.add(new Song("PAM", "https://open.spotify.com/track/0eeKDrQxjqNl5bX5VCHDcn",
				"https://i.scdn.co/image/ab67616d0000b273e3404c5bae6faab4087dd91e", "2020-05-01", "201000", "85",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Sech"));
		arstist.add(artistRepository.findByName("Justin Quiles"));
		artistmap.add(new Song("Fabuloso", "https://open.spotify.com/track/3cg2Y9mIiYNdcPTLKaQgK3",
				"https://i.scdn.co/image/ab67616d0000b273a00b470b311631817cc9fe93", "2020-05-21", "200494", "79",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Sech"));
		artistmap.add(new Song("Relación", "https://open.spotify.com/track/3ZG8N7aWw2meb6UrI5ZmnZ",
				"https://i.scdn.co/image/ab67616d0000b273a00b470b311631817cc9fe93", "2020-05-21", "184254", "83",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Nengo Flow"));
		arstist.add(artistRepository.findByName("Anuel AA"));
		artistmap.add(new Song("Sur y Norte", "https://open.spotify.com/track/2uy5wXDZQcdd89PvDBSfyy",
				"https://i.scdn.co/image/ab67616d0000b27391d1753fe74af347cd36f539", "2020-05-15", "215172", "72",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Aya Nakamura"));
		arstist.add(artistRepository.findByName("Maluma"));
		artistmap.add(new Song("Djadja (feat. Maluma) - Remix", "https://open.spotify.com/track/6AzKhCHOms83jvNVLsz0Bt",
				"https://i.scdn.co/image/ab67616d0000b2734ec452efed595a418b746ce8", "2020-06-12", "166850", "82",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Feid"));
		arstist.add(artistRepository.findByName("J Balvin"));
		arstist.add(artistRepository.findByName("Maluma"));
		arstist.add(artistRepository.findByName("Nicky Jam"));
		arstist.add(artistRepository.findByName("Sech"));
		arstist.add(artistRepository.findByName("Justin Quiles"));

		artistmap.add(new Song("Remix ( Feat. Maluma, Nicky Jam, Sech) - Remix",
				"https://open.spotify.com/track/7lUdbnz7wsv3C9zzf4WHl9",
				"https://i.scdn.co/image/ab67616d0000b273428aec92d4196f338a5bf1d5", "2020-06-26", "333800", "76",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Chema Rivas"));
		artistmap.add(new Song("Mil Tequilas", "https://open.spotify.com/track/0qvfIq8RsH3sOZk9JIuUhn",
				"https://i.scdn.co/image/ab67616d0000b2732e269fc6dbe1d9b0ddba253d", "2019-10-18", "255450", "78",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Anuel AA"));
		arstist.add(artistRepository.findByName("Tego Calderon"));
		artistmap.add(new Song("Jangueo", "https://open.spotify.com/track/7KKh0ujp8agIiCrkiJhf81",
				"https://i.scdn.co/image/ab67616d0000b2733cb695bfc1246bdf66161fce", "2020-05-29", "231745", "83",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Lérica"));
		arstist.add(artistRepository.findByName("Belinda"));
		artistmap.add(new Song("Flamenkito", "https://open.spotify.com/track/4fsj5oMLYrCUlTDs4P9qw5",
				"https://i.scdn.co/image/ab67616d0000b2733212a80b80e188e7e8b8c736", "2020-05-07", "202153", "75",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Jhay Cortez"));
		arstist.add(artistRepository.findByName("Bad Bunny"));
		artistmap.add(new Song("CÓMO SE SIENTE - Remix", "https://open.spotify.com/track/2tFwfmceQa1Y6nRPhYbEtC",
				"https://i.scdn.co/image/ab67616d0000b273464c8458b8b0cfcfb655fbfc", "2020-05-09", "227520", "87",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Camilo"));
		artistmap.add(new Song("Favorito", "https://open.spotify.com/track/0jT8Nl0shPS8115is0wD2Q",
				"https://i.scdn.co/image/ab67616d0000b273b4da01f3f98d18af9432e3dd", "2020-04-17", "209765", "81",
				arstist));

		arstist = new ArrayList<Artist>();
		arstist.add(artistRepository.findByName("Anuel AA"));
		artistmap.add(new Song("Reggaetonera", "https://open.spotify.com/track/6yVkakCN460KOVol9ZazjH",
				"https://i.scdn.co/image/ab67616d0000b2733cb695bfc1246bdf66161fce", "2020-05-29", "212312", "84",
				arstist));

		for (Song at : artistmap) {
			songRepository.save(at);
		}

	}

	private void artists() {

		String name1 = "Ozuna";
		String url1 = "https://open.spotify.com/artist/1i8SpTcr7yvPOmcqrbnVXY";

		String name2 = "Nio Garcia";
		String url2 = "https://open.spotify.com/artist/5hdhHgpxyniooUiQVaPxQ0";

		String name3 = "Anuel AA";
		String url3 = "https://open.spotify.com/artist/2R21vXR83lH98kGeO99Y66";

		String name4 = "Myke Towers";
		String url4 = "https://open.spotify.com/artist/7iK8PXO48WeuP03g8YR51W";

		String name5 = "Brray";
		String url5 = "https://open.spotify.com/artist/1GKIlPFdcewHtpDVCQ8zmJ";

		String name6 = "Juanka";
		String url6 = "https://open.spotify.com/artist/3Wb38LDP3N4tkobValgE9D";

		String name7 = "Prince Royce";
		String url7 = "https://open.spotify.com/artist/3MHaV05u0io8fQbZ2XPtlC";

		String name8 = "Bad Bunny";
		String url8 = "https://open.spotify.com/artist/4q3ewBCX7sLwd24euuV69X";

		String name9 = "Jay Wheeler";
		String url9 = "https://open.spotify.com/artist/2cPqdH7XMvwaBJEVjheH8g";

		String name10 = "DJ Nelson";
		String url10 = "https://open.spotify.com/artist/2ydZrTy8U3kOMOzx20s3dg";

		String name11 = "Don Patricio";
		String url11 = "https://open.spotify.com/artist/6vPXtLmNd3mW0dd1Rb9eQ9";

		String name12 = "Mozart La Para";
		String url12 = "https://open.spotify.com/artist/0odliLZMTk45CEVzF3Zocl";

		String name13 = "Justin Quiles";
		String url13 = "https://open.spotify.com/artist/14zUHaJZo1mnYtn6IBRaRP";

		String name14 = "Daddy Yankee";
		String url14 = "https://open.spotify.com/artist/4VMYDCV2IEDYJArk749S6m";

		String name15 = "El Alfa";
		String url15 = "https://open.spotify.com/artist/2oQX8QiMXOyuqbcZEFsZfm";

		String name16 = "Sech";
		String url16 = "https://open.spotify.com/artist/77ziqFxp5gaInVrF2lj4ht";

		String name17 = "Nengo Flow";
		String url17 = "https://open.spotify.com/artist/12vb80Km0Ew53ABfJOepVz";

		String name18 = "Aya Nakamura";
		String url18 = "https://open.spotify.com/artist/7IlRNXHjoOCgEAWN5qYksg";

		String name19 = "Feid";
		String url19 = "https://open.spotify.com/artist/2LRoIwlKmHjgvigdNGBHNo";

		String name20 = "Chema Rivas";
		String url20 = "https://open.spotify.com/artist/1tMWkquIkQtVD6vaZlDbSQ";

		String name21 = "Tego Calderon";
		String url21 = "https://open.spotify.com/artist/3SUT1jjM5hzZj9TLfLZGIP";

		String name22 = "Jhay Cortez";
		String url22 = "https://open.spotify.com/artist/0EFisYRi20PTADoJrifHrz";

		String name23 = "Lérica";
		String url23 = "https://open.spotify.com/artist/4d3kmfoZBTuUPSUjgP45uo";

		String name24 = "Belinda";
		String url24 = "https://open.spotify.com/artist/5LeiVcEnsZcwc133TUhJNW";

		String name25 = "Camilo";
		String url25 = "https://open.spotify.com/artist/28gNT5KBp7IjEOQoevXf9N";

		String name26 = "Maluma";
		String url26 = "https://open.spotify.com/artist/1r4hJ1h58CWwUQe3MxPuau";

		String name27 = "J Balvin";
		String url27 = "https://open.spotify.com/artist/1vyhD5VmyZ7KMfW5gqLgo5";

		String name28 = "Nicky Jam";
		String url28 = "https://open.spotify.com/artist/1SupJlEpv7RS2tPNRaHViT";

		artistRepository.save(new Artist(url1, name1));
		artistRepository.save(new Artist(url2, name2));
		artistRepository.save(new Artist(url3, name3));
		artistRepository.save(new Artist(url4, name4));
		artistRepository.save(new Artist(url5, name5));
		artistRepository.save(new Artist(url6, name6));
		artistRepository.save(new Artist(url7, name7));
		artistRepository.save(new Artist(url8, name8));
		artistRepository.save(new Artist(url9, name9));
		artistRepository.save(new Artist(url10, name10));

		artistRepository.save(new Artist(url11, name11));
		artistRepository.save(new Artist(url12, name12));
		artistRepository.save(new Artist(url13, name13));
		artistRepository.save(new Artist(url14, name14));
		artistRepository.save(new Artist(url15, name15));
		artistRepository.save(new Artist(url16, name16));
		artistRepository.save(new Artist(url17, name17));
		artistRepository.save(new Artist(url18, name18));
		artistRepository.save(new Artist(url19, name19));
		artistRepository.save(new Artist(url20, name20));

		artistRepository.save(new Artist(url21, name21));
		artistRepository.save(new Artist(url22, name22));
		artistRepository.save(new Artist(url23, name23));
		artistRepository.save(new Artist(url24, name24));
		artistRepository.save(new Artist(url25, name25));
		artistRepository.save(new Artist(url26, name26));
		artistRepository.save(new Artist(url27, name27));

		artistRepository.save(new Artist(url28, name28));
	}


}
