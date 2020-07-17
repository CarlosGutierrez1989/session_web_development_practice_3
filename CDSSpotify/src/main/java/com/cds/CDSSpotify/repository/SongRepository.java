package com.cds.CDSSpotify.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cds.CDSSpotify.model.Song;

public interface SongRepository extends MongoRepository<Song, String> {

}
