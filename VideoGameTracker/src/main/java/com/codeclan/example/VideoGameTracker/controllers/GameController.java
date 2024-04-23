package com.codeclan.example.VideoGameTracker.controllers;

import com.codeclan.example.VideoGameTracker.models.Game;
import com.codeclan.example.VideoGameTracker.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/games")
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    @GetMapping(value = "games/{id}")
    public Optional<Game> getGame(@PathVariable Long id){
        return gameRepository.findById(id);
    }
}
