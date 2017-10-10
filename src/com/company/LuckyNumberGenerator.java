package com.company;

/**
 * Created by je565 on 10/10/17.
 */

public class LuckyNumberGenerator {
    public int LuckyNumber;
    public int luck = (int)(Math.random()*46341);

    public LuckyNumberGenerator() {
    }

    public int perfectRandom() {
        LuckyNumber = (int)(Math.pow(luck, 2));
        return LuckyNumber;
    }
}