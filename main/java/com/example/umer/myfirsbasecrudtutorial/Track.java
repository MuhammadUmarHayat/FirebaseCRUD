package com.example.umer.myfirsbasecrudtutorial;

/**
 * Created by umer on 12/29/2019.
 */

public class Track
{


    private String id;
    private String trackName;
    private int rating;

    public Track() {

    }

    public Track(String id, String trackName, int rating) {
        this.trackName = trackName;
        this.rating = rating;
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getRating() {
        return rating;
    }
}
