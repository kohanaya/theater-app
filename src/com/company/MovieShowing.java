package com.company;

import java.util.Date;

public class MovieShowing {

    public String showingDateTime;
    public String movieName;

    public MovieShowing(String movieName, String date) {
        this.movieName = movieName;
        this.showingDateTime = date;
    }
}
