package com.cds.CDSSpotify.model;

import java.util.List;

public class SongAux {

	private String name;
	private String external_url;
	private String image;
	private String release_date;
	private String duration_ms;
	private List<String> artists;
	
	public SongAux() {
		
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

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}
	
	
	
}
