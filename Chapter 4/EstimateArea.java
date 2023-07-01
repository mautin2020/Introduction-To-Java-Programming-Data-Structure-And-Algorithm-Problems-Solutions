package com.mycompany.exercise4;

public class EstimateArea {
    public static void main(String[] args){
       final double charlotteX, charlotteY, savannahX, savannahY, orlandoX, orlandoY, atlantaX, atlantaY;
        
        final double radius = 6371.01;
        
        charlotteX = 35.2270869;
        charlotteY = -80.8431267;
        
        savannahX = 32.0835407;
        savannahY = -81.0998342;
        
        orlandoX = 28.5383355;
        orlandoY = -81.3792365;
        
        atlantaX = 33.7489954;
        atlantaY = -84.3879824;
        
        // getting the distance of the first side of the polygon
        double atlantaToCharlotte = radius * Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX) + 
                                    Math.cos(atlantaX) * Math.cos(charlotteX) * 
                                    Math.cos(atlantaY - charlotteY));
        double charlotteToSavannah = radius * Math.acos(Math.sin(charlotteX) * Math.sin(savannahX) +
                                     Math.cos(charlotteX) * Math.sin(savannahX) *
                                     Math.cos(charlotteY - savannahY));
        double savannahToAtlanta = radius * Math.acos(Math.sin(savannahX) * Math.sin(atlantaX) +
                                    Math.cos(savannahX) * Math.cos(atlantaX) *
                                    Math.cos(savannahY - atlantaY));
        
        // getting the distance of the second side of the polygon
        
        double atlantaToOrlando = radius * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) +
                                    Math.cos(atlantaX) * Math.cos(orlandoX) *
                                    Math.cos(atlantaY - orlandoY));
        double orlandoToSavannah = radius * Math.acos(Math.sin(orlandoX) * Math.sin(savannahX) +
                                    Math.cos(orlandoX) * Math.cos(savannahX) *
                                    Math.cos(orlandoY - savannahY));
        
        double a = atlantaToOrlando;
        double b = orlandoToSavannah;
        double c = savannahToAtlanta;
        
        double s1 = (a + b + c) / 2;
    }
}
