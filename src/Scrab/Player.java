package Scrab;

import java.util.ArrayList;

public class Player {
    private long id;
    private String Pname;
    private int score;
    private ArrayList<Tile> TileList;


    public Player(long id, String name) {
        Pname = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
