package com.aprilc.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.aprilc.lookify.models.Song;
import com.aprilc.lookify.repositories.SongRepo;
@Service
public class SongService {
	private SongRepo songRepo;
    public SongService(SongRepo songRepo){
        this.songRepo = songRepo;
    }
    
    
    public List<Song> allSongs() {
        return songRepo.findAll();
    }
    
    public void addSong(Song song) {
    		songRepo.save(song);
    }
    
    public Song findSongById(Long id) {
        return songRepo.findOne(id);
    }
    
    public void destroySong(Long id) { 
        songRepo.delete(id);
    }
    
    public List<Song> findSongByArtist(String searchTerm) {
        return songRepo.findByArtistContaining(searchTerm);
    }
}
