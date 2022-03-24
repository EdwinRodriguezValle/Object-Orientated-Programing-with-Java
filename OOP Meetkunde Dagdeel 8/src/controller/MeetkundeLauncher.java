package controller;

import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MeetkundeLauncher {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Geef de straal van je cirkel: ");
            try {
                double straal = invoer.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                System.out.println(ingevoerdeCirkel);
                onjuisteInvoer = false;
            } catch (InputMismatchException kommaGetalFout) {
                System.out.println("Je moet een decimaal getal met een , (komma) intypen!");
                invoer.nextLine();
            } catch (IllegalArgumentException straalFout) {
                System.out.println(straalFout.getMessage());
                invoer.nextLine();
            }
        }
    }
}
