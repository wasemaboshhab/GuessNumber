package com.company;

import java.util.Scanner;

public class NewGuess {
    public static final int MAXIMUM_PLAYERS = 5;
    public static final int RANDOM_NUMBER_UP_TO_HUNDRED= 101 ;
    public static void main(String[] args) {
        String[] players = new String[MAXIMUM_PLAYERS];
        inputPlayerNames(players);
        checkWinner(players);


































    }
    public static String[] inputPlayerNames(String[] playersName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("Try to guess the Number from 0 to 100");
        System.out.println("Enter your names: ");
        for (int i = 0; i < playersName.length ; i++) {
            System.out.println("Player "+(i+1)+" :");
           playersName[i]= scanner.next().toUpperCase();
        }
        return playersName;
    }


    public static void checkWinner(String[] playersName) {
        Scanner scanner = new Scanner(System.in);
        int[] playersGuess = new int[MAXIMUM_PLAYERS];
        int randomNumber = (int) (Math.random() * RANDOM_NUMBER_UP_TO_HUNDRED);
        int i = 0; //  the variable {i} is  player's (Name & Guess)
        while (true) {
            System.out.println('[' + playersName[i] + ']' + "\nguess a number: ");
            playersGuess[i] = scanner.nextInt();
            if (playersGuess[i] != randomNumber) {
                if(playersGuess[i] > randomNumber)
                    System.out.println("Wrong, its lower");
                else
                    System.out.println("Wrong, its higher");
            }
            else {
                System.out.println("correct guess " + '[' + playersName[i] + ']' + " you are the winner! :)");
                break;
            }
            System.out.println("***************************************");
            i++;
            if (i == MAXIMUM_PLAYERS)
                i = 0;
        }
    }
}
