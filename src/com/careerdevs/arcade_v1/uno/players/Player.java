package com.careerdevs.arcade_v1.uno.players;

public class Player implements Actors {

    public final String Name;

    public Player(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

}