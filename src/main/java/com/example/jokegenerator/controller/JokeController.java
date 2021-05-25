package com.example.jokegenerator.controller;

import com.example.jokegenerator.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke() );
        return "joke";
    }
}
