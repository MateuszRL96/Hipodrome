package org.example;

import javax.swing.*;
import java.util.ArrayList;

import static org.example.Hippodrome.game;

public class Main {
    public static void main(String[] args) {
        System.out.println("sdadad");
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Kon1", 3,0));
        game.getHorses().add(new Horse("Kon2", 3,0));
        game.getHorses().add(new Horse("Kon3", 3,0));

    }
}



