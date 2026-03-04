package org.example;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private final GameConfiguration config;

    public Game(GameConfiguration config) {

        this.config = config;
    }

    public void runGame(){

        System.out.println("Welcome to the game");
        System.out.println("You have " + config.turns() + "chances to guess");

        for(int attempt = 1; attempt <= config.turns(); attempt++) {
            Scanner myNum = new Scanner(System.in);
            System.out.println("Enter number");
            Integer num = myNum.nextInt();
            System.out.println("Number chosen is " + num);

            Random num1 = new Random();
            int newNum = num1.nextInt(50);

            if (newNum == num) {
                System.out.println("number matches");
            } else if (num < newNum) {
                System.out.println("Guess was too low");
            } else if (num > newNum) {
                System.out.println("Guess was too high");
            }
            System.out.println("You lost, number was " + newNum);
        }}}







