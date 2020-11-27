package com.github.fein0801.mcuchecklist.model;

import java.util.ArrayList;

public class FullMovieList {
    private ArrayList<Movie> phaseOne;
    private ArrayList<Movie> phaseTwo;
    private ArrayList<Movie> phaseThree;

    public ArrayList<Movie> getPhaseOne() {
        return phaseOne;
    }

    public void setPhaseOne(ArrayList<Movie> phaseOne) {
        this.phaseOne = phaseOne;
    }

    public ArrayList<Movie> getPhaseTwo() {
        return phaseTwo;
    }

    public void setPhaseTwo(ArrayList<Movie> phaseTwo) {
        this.phaseTwo = phaseTwo;
    }

    public ArrayList<Movie> getPhaseThree() {
        return phaseThree;
    }

    public void setPhaseThree(ArrayList<Movie> phaseThree) {
        this.phaseThree = phaseThree;
    }

    public String toString() {
        return "{phaseOne: " + this.phaseOne + ", phaseTwo: " + this.phaseTwo + ", phaseThree: " + this.phaseThree + "}";
    }
}
