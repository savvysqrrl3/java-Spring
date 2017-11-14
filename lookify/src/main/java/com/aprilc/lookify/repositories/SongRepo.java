package com.aprilc.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aprilc.lookify.models.Song;


public interface SongRepo extends CrudRepository<Song, Long> {
	List<Song> findAll();
	List<Song> findByArtistContaining(String search);
}
