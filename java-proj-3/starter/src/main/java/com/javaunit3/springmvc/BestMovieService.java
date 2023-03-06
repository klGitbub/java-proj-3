package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Create a new class BestMovieService. Define it as a spring component so that it will be available in the Spring application context.
@Component
public class BestMovieService {
    //Define a private Movie property, and use Spring annotations so that it is Autowired

    private Movie movie;

    //Define a method getBestMovie() that returns the movie

    public Movie getBestMovie() {
        return movie;
    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
}
