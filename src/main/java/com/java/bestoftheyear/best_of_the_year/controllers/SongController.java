package com.java.bestoftheyear.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.bestoftheyear.best_of_the_year.classess.Song;

import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/")
public class SongController {

    private List<Song> getBestSong() {
        List <Song> songsList = new ArrayList<> ();
        songsList.add(new Song("Bohemian Rhapsody", 1));
        songsList.add(new Song("Imagine", 2));
        songsList.add(new Song("Smells Like Teen Spirit", 3));
        return songsList;
    }

    @GetMapping("/songs")
    public String getSongList(Model model) {
        model.addAttribute("songs", getBestSong());
        return "songs";
    }

    @GetMapping("/songs/{id}")
    public String getSongById(Model model,@PathVariable int id) {
        for ( Song song : getBestSong()) {
            if (song.getId()==id) {
                model.addAttribute(song);
            }
        }
        return "songById";
    }


}
