package com.careerdevs.components;

import java.util.ArrayList;

public abstract class Game {
    private String name;
    private String rules;
    private int playerCount;
    private int intialDie;
    private ArrayList<Player> playerList = new ArrayList ();
    private ArrayList<Byte> scoreBoard = new ArrayList<> ();

    public Game(String name, String rules, int die) {
        this.name = name;
        this.rules = rules;

        this.intialDie = die;
    }


    public String getName() {
        return name;
    }


    public int getIntialDie() {
        return intialDie;
    }


    public String getRules() {
        return rules;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setScoreBoard(ArrayList<Byte> scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public ArrayList<Byte> getScoreBoard() {
        return scoreBoard;
    }

    public void addPlayer(Player player){

        playerList.add ( player );

    }

    public void removePlayer(Player player){

        playerList.remove ( playerList.indexOf ( player ) );
    }

}
