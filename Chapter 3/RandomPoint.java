package com.mycompany.exercise3;

public class RandomPoint {
    public static void main(String[] args) {
     
        int xCoordinate = (int)((Math.random() * 100) - 50);
        int yCorrdinate = (int)((Math.random() * 200) - 100);
    
        System.out.println("Random point (x, y) is: " + xCoordinate + " , " + yCorrdinate);
    }
}
