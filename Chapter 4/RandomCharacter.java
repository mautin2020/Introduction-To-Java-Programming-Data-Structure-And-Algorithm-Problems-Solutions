package com.mycompany.exercise4;

public class RandomCharacter {
    public static void main(String[] args) {
        // we need to generate number between 65 and 90
        // 65 - 90 is the ASCII character A to Z
        int random = 65 + (int) (Math.random() * 26);
        System.out.println((char) (random));
    }
}