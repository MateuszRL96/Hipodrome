package org.example;

import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;
    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
}
