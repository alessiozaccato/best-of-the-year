package com.java.bestoftheyear.best_of_the_year.classess;

public class Movie {

    private String title;
    private int id;

    public Movie(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
