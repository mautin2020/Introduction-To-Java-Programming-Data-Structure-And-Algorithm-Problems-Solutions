package com.mycompany.exercise3;

public class PickACard {
    public static void main(String[] args) {
        // generate random number from 1 - 13
        int rank = (int)((Math.random() * (14 - 1)) + 1);
        
        // Generate random integer from 1 - 4
        int suit = (int)(Math.random() * 4);
        
        System.out.print("The card you picked is ");
        switch(rank) {
            case 1: System.out.print("Ace"); break;
            case 2: System.out.print("rank"); break;
            case 3: System.out.print("rank"); break;
            case 4: System.out.print("rank"); break;
            case 5: System.out.print("rank"); break;
            case 6: System.out.print("rank"); break;
            case 7: System.out.print("rank"); break;
            case 8: System.out.print("rank"); break;
            case 9: System.out.print("rank"); break;
            case 10: System.out.print("rank"); break;
            case 11: System.out.print("Jack"); break;
            case 12: System.out.print("Queen"); break;
            case 13: System.out.print("King"); 
        }
            System.out.print(" of ");
        switch(suit) {
            case 1: System.out.print("Clubs"); break;
            case 2: System.out.print("Diamonds"); break;
            case 3: System.out.print("Hearts"); break;
            case 4: System.out.print("Spades"); break;
        }
    }
}
