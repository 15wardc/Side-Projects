package com.techelevator;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {

        /* in this project I will attempt to create a coin toss game.
        1) make it so user selects heads or tails.
        2) randomize selection between heads and tails
        3) if user was right, respond accordingly
        4) if user was wrong, respond.

         */

        Scanner keyboard = new Scanner(System.in);
        //show the users balance
        int balance = 100;
        //ask how much they want to bet;
        while (balance > 2) {
            System.out.println("Current balance is: " + balance);
            System.out.println("How much would you like to bet? ");
            String betAmountString = keyboard.nextLine();
            int betAmount = Integer.parseInt(betAmountString);

            System.out.println("Heads or Tails? ");
            String headsOrTails = keyboard.nextLine();

            Random rand = new Random();
            int nxt = rand.nextInt(1);
            if (nxt == 0 && headsOrTails.equalsIgnoreCase("heads")){
                System.out.println("Heads");
                System.out.println("You win " + betAmountString);
                balance += (betAmount);
            } else if (nxt == 1 && headsOrTails.equalsIgnoreCase("tails")) {
                System.out.println("Tails");
                System.out.println("You win " + betAmountString);
                balance += (betAmount);
            } else if (nxt == 0 && headsOrTails.equalsIgnoreCase("tails")){
                System.out.println("Heads");
                System.out.println("You lose " + betAmountString);
                balance -= betAmount;

            } else if (nxt == 1 && headsOrTails.equalsIgnoreCase("heads")){
                System.out.println("Tails");
                System.out.println("You lose " + betAmountString);
                balance -= betAmount;
            } else {
                System.out.println(balance);
            }

        }
    }
}

