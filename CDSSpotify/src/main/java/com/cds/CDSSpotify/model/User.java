package com.cds.CDSSpotify.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	String _id;

	private String name;
	private String email;
	private String password;
	String photo;
	String musicLike;
	
	public User(String name, String email, String password) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMusicLike() {
		return musicLike;
	}

	public void setMusicLike(String musicLike) {
		this.musicLike = musicLike;
	}

	
}
