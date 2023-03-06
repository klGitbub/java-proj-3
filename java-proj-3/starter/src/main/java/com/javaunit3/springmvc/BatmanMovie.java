package com.javaunit3.springmvc;

//Implement movie interface

import org.springframework.stereotype.Component;

@Component
public class BatmanMovie implements Movie {

    //Implement getTitle() to return the title "Batman: The Dark Knight"
    public String getTitle() {
        return "Batman: The Dark Knight";
    }
    //Implement getMaturityRating() to return "PG-13"
    public String getMaturityRating() {
        return "PG-13";
    }
    //Implement getGenre() to return "Action
    public String getGenre() {
        return "Action";
    }
}
