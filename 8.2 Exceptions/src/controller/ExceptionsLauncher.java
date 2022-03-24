package controller;

import model.Vierkant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsLauncher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean fouteInvoer = true;
        double zijde = 0;
        double oppervlakte = 0;
        // Opdracht 3. Controleer op juiste invoer van een getal.
        while (fouteInvoer) {
            try {
                System.out.print("Geef een zijde: ");
                zijde = input.nextDouble();
                fouteInvoer = false;
            } catch (InputMismatchException fout) {
                System.out.println("Je moet een getal invoeren met een komma.");
                input.next(); // Om de buffer te legen.
            }
        }
        // Geef nu de oppervlakte terug.
        Vierkant vierkant = new Vierkant(zijde);
        System.out.printf("De oppervlakte is: %.2f\n", vierkant.getOppervlakte());

        // Opdracht 4. Controleer op een positieve invoer van de oppervlakte.
        // Ook nu wordt gecontroleerd dat er een getal wordt ingevoerd.
        boolean negatieveInvoer = true;
        while (negatieveInvoer) {
            fouteInvoer = true;
            while (fouteInvoer) {
                try {
                    System.out.print("Geef een oppervlakte: ");
                    oppervlakte = input.nextDouble();
                    fouteInvoer = false;
                } catch (InputMismatchException fout) {
                    System.out.println("Je moet een getal invoeren met een komma.");
                    input.next(); // Om de buffer te legen.
                }
            }
            // De oppervlakte is een getal. Controleer hier of dit niet negatief is.
            try {
                System.out.printf("De bijbehorende zijde is %.2f\n", Vierkant.berekenZijde(oppervlakte));
                negatieveInvoer = false;
            } catch (IllegalArgumentException berekenZijdeFout) {
                System.out.println(berekenZijdeFout.getMessage());
            }
        }
    }
}
