package com.java.bestoftheyear.best_of_the_year.classess;



public class Song {

    private String title;
    private int id;


    public Song(String title,int id) {
        this.title=title;
        this.id=id;
    }

    public String getName() {
        return this.title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
