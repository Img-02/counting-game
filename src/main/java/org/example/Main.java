package org.example;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {


        int turns = 3;

        Random num1 = new Random();
        int newNum = num1.nextInt(50);

        //System.out.println("Random num is " + newNum);

        for (int i = 0; i < turns; i++) {
            Scanner myNum = new Scanner(System.in);
            System.out.println("Enter number");

            Integer num = myNum.nextInt();
            System.out.println("Number chosen is " + num);

            if (newNum == num) {
                System.out.println("number matches");
            } else if (num < newNum) {
                System.out.println("Guess was too low");
            } else if (num > newNum) {
                System.out.println("Guess was too high");
            }
        }
        System.out.println("You lost, number was " + newNum);
    }
}




