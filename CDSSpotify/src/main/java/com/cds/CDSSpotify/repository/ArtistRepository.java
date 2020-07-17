package com.cds.CDSSpotify.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cds.CDSSpotify.model.Artist;

public interface ArtistRepository extends MongoRepository<Artist, String> {

	Artist findByName(String string);

}
