package com.example.animegirls.services.model;

public class AnimeGirl {

    String name;
    String anime;

    public AnimeGirl(String name, String anime) {
        this.name = name;
        this.anime = anime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }
}
