package controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        final int OVERGEWITCH = 25;

        // Lente in centimeters
        System.out.println("Geeft je lengte in centimeters? ");
        Scanner input = new Scanner(System.in);
        double lengte = input.nextDouble();

        System.out.println("Geeft je gewicht in kilogram? ");
        int gewicht = input.nextInt();

        double lengte_m = lengte/100.0;
        double BMI = gewicht / (lengte_m * lengte_m );

        System.out.println("Je BMI is:  " + BMI + "\n je ben goed op je gewitch.");

        if(BMI > OVERGEWITCH){
            System.out.println("Je ben overgewitch.");
        }else{
            System.out.println("Je ben gezond!!");
        }
    }
}
