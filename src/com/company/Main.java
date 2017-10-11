package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int j = 0; j <= 5; j += 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = input.nextLine();

            int lucky = new LuckyNumberGenerator().perfectRandom();
            System.out.println("Nice to meet you " + name + "! Your lucky number is " + lucky);
            System.out.println("If you would like to exit, enter 0. If you would like a listing of your name and your lucky number, enter 1. If you would like to try again, enter 2. Thank you.");

            Scanner nextInput = new Scanner(System.in);
            int repeat = nextInput.nextInt();

            if (repeat == 0) {
                System.out.println("Goodbye!");
                break;
            }
            else if (repeat == 1) {
                System.out.println("Your name is " + name + " and your lucky number is " + lucky);
                break;
            }
            else if (repeat == 2) {
            }
            else {
                System.out.println("Not a valid input. Goodbye");
                break;
            }
        }
    }
}
