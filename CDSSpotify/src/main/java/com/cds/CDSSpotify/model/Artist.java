package com.cds.CDSSpotify.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Artist")
public class Artist {

	public Artist(String href, String name) {
		this.href = href;
		this.name = name;
	}

	public Artist() {
		// TODO Auto-generated constructor stub
	}

	@Id
	private String _id;
	private String href;
	private String name;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
