package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
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
        }
        if (repeat == 1) {
            System.out.println("Your name is " + name + " and your lucky number is " + lucky);
        }
        if (repeat == 2) {
            
        }
    }
}
