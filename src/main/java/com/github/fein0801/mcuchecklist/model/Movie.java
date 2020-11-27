package com.github.fein0801.mcuchecklist.model;

public class Movie {

    private int id;
    private String title;
    private int releaseYear;
    // Runtime in minutes
    private int runtime;
    private String iconURL;
    private String description;
    private boolean watched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public String toString() {
        return "{id: " + this.id + ", title: \"" + this.title + "\", releaseYear: " + this.releaseYear +
                ", runtime: " + this.runtime + ", iconURL: \"" + this.iconURL + "\", description: \"" + this.description + "\"}";
    }
}
