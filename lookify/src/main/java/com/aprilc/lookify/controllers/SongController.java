package com.aprilc.lookify.controllers;

import javax.validation.Valid;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aprilc.lookify.models.Song;
import com.aprilc.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;
    public SongController(SongService songService){
        this.songService = songService;
    }
    @RequestMapping("/")
    public String songs() {
        return "index";
    } 
    
    @RequestMapping("/dashboard")
    public String dashboard(Model model, @ModelAttribute("song") Song song) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
    	
        return "home";
    }
    
    @RequestMapping("/songs/new")
    public String addSong(@ModelAttribute("song") Song song) {
        return "create";
    }
    
    @PostMapping("/songs/new")
    public String newSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
    		if (result.hasErrors()) {
            return "create";
        }
    		else{
            songService.addSong(song);
            return "redirect:/dashboard";
    		}
    
    }
    
    @RequestMapping("/songs/{id}")
    public String findSongById(Model model, @PathVariable("id") Long id) {
        Song song = songService.findSongById(id);
        model.addAttribute("song", song);
        model.addAttribute("id", id);
        return "show";
    }
    
    @RequestMapping(value="/songs/delete/{id}")
    public String destroySong(@PathVariable("id") Long id) {
        songService.destroySong(id);
        return "redirect:/dashboard";
    }
    
    @RequestMapping("/search/topTen")
    public String top10(Model model, @ModelAttribute("song") Song song) {
        List<Song> songs = songService.allSongs();
        Collections.sort(songs, Comparator.comparingInt(Song::getRating).reversed());
        
        model.addAttribute("songs", songs);
        return "top";
    }
    
    @RequestMapping(path="/search", method=RequestMethod.GET)
    public String search(@RequestParam("searchString") String searchString, Model model) {
    	
    	List<Song> songs = songService.allSongs();
        if(searchString != null){
            List<Song> searchResults = songService.findSongByArtist(searchString);
            model.addAttribute("results", searchResults);
            model.addAttribute("artist", searchString);
        }

        return "find";
    }
    
}
