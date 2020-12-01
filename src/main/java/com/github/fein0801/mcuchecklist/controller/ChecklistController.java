package com.github.fein0801.mcuchecklist.controller;

import com.github.fein0801.mcuchecklist.helpers.JSONHelper;
import com.github.fein0801.mcuchecklist.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ChecklistController {

    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("redirect:/movies");
    }

    @RequestMapping("/movies")
    public ModelAndView movies() {
        ArrayList<Movie> movieList = new JSONHelper().readFullMovieList();
        ModelAndView mv = new ModelAndView("movies");
        return mv.addObject("movieList", movieList);
    }

}
