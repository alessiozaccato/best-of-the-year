package com.java.bestoftheyear.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.bestoftheyear.best_of_the_year.classess.Movie;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class MovieController {

    private List <Movie> getBestMovies(){
        List <Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("Il Padrino", 1));
        moviesList.add(new Movie("Inception", 2));
        moviesList.add(new Movie("Pulp Fiction", 3));
        return moviesList;
    }
    
    
    @GetMapping("/movies")
    public String getMovieList(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "movies";
    }
    

}
