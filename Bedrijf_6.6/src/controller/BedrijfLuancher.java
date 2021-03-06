package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class BedrijfLuancher {
    public static void main(String[] args) {
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

    }
////////////////////////////
    public static void toonJaarInkomen(Persoon p) {
        System.out.printf("%s verdient %.2f per jaar\n", p.getNaam(), p.berekenJaarInkomen());
    }
    }


        /*Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000);
        Werknemer assistent = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
        Zzper medewerker = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);
        medewerker.huurIn(160);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00);
        projectleider.huurIn(320);

        Persoon[] personen = new Persoon[4];
        personen[0] = baas;
        personen[1] = assistent;
        personen[2] = medewerker;
        personen[3] = projectleider;

        for (int personenTeller = 0; personenTeller < 4; personenTeller++) {
            toonJaarInkomen(personen[personenTeller]);
        }
    }*/




