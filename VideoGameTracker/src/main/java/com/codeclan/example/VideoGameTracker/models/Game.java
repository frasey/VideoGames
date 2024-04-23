package com.codeclan.example.VideoGameTracker.models;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;


    public Game(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public Game() {

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
