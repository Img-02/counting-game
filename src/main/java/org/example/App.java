package org.example;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static void main(String[] args) {

        GameConfiguration config = new GameConfiguration(4, 1, 10);
        Game game = new Game(config);
        game.runGame();
    }
}

