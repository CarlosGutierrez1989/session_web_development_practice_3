package com.cds.CDSSpotify.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Song")
public class Song {

	@Id
	private String _id;

	private String name;
	private String external_url;
	private String image;
	private String release_date;
	private String duration_ms;
	private String popularity;
	private boolean like;

	public Song(String name, String external_url, String image, String release_date, String duration_ms,
			String popularity, List<Artist> artists) {
		this.name = name;
		this.external_url = external_url;
		this.image = image;
		this.release_date = release_date;
		this.duration_ms = duration_ms;
		this.popularity = popularity;
		this.artists = artists;
		this.like = false;
	}

	public Song() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	private List<Artist> artists;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExternal_url() {
		return external_url;
	}

	public void setExternal_url(String external_url) {
		this.external_url = external_url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getDuration_ms() {
		return duration_ms;
	}

	public void setDuration_ms(String duration_ms) {
		this.duration_ms = duration_ms;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

}
