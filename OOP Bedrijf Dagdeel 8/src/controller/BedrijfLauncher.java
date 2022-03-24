package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BedrijfLauncher {
    public static void main(String[] args) {
        /*
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
        ArrayList<Persoon> personen = new ArrayList<>();
        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));
        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));
        for (Persoon persoon : personen) {
            if (persoon instanceof Zzper) {
                ((Zzper) persoon).huurIn(320);
            }
            if (persoon instanceof Vrijwilliger) {
                ((Vrijwilliger) persoon).huurIn(160);
            }
        }
        Collections.sort(personen);
        for (Persoon persoon : personen) {
            System.out.println(persoon);
            toonJaarInkomen(persoon);
        }
        */

        Scanner invoer = new Scanner(System.in);
        System.out.print("Geef de naam: ");
        String naam = invoer.nextLine();
        System.out.print("Geef de woonplaats: ");
        String woonplaats = invoer.nextLine();
        System.out.print("Geef de naam van de afdeling: ");
        String afdelingsNaam = invoer.nextLine();
        System.out.print("Geef de plaats van de afdeling: ");
        String afdelingsPlaats = invoer.nextLine();
        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Geef het maandsalaris: ");
            double maandSalaris = invoer.nextDouble();
            try {
                Werknemer werknemer = new Werknemer(naam, woonplaats, new Afdeling(afdelingsNaam, afdelingsPlaats), maandSalaris);
                System.out.println(werknemer);
                onjuisteInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is op de juiste wijze afgehandeld.");
            }
        }
    }

    /*
    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
    */
}
