package controller;

import model.*;

import java.util.ArrayList;

public class MeetkundeLauncher {
    public static void main(String[] args) {
        ArrayList<Cirkel> mijnCirkels = new ArrayList<>();
        mijnCirkels.add(new Cirkel(3, new Punt(1, 4), "groen"));
        mijnCirkels.add(new Cirkel());
        mijnCirkels.add(new Cirkel(6));
        System.out.printf("Er zijn nu %d cirkels\n", mijnCirkels.size());
        System.out.println("De straal van mijn tweede cirkel is: " + mijnCirkels.get(1).getStraal());
        mijnCirkels.remove(2);
        System.out.printf("Er zijn nu %d cirkels\n", mijnCirkels.size());
        for (int arrayTeller = 0; arrayTeller < mijnCirkels.size(); arrayTeller++) {
            toonInformatie(mijnCirkels.get(arrayTeller));
            System.out.println();
        }

        for (Cirkel mijnCirkel : mijnCirkels) {
            toonInformatie(mijnCirkel);
            System.out.println();
        }

        Oppervlak oppervlak = new Oppervlak(10, 7);
        oppervlak.voegFiguurToe(new Rechthoek(3, 3, new Punt(0, 7), "rood"));
        oppervlak.voegFiguurToe(new Rechthoek(3, 2, new Punt(0, 4), "geel"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(0, 2), "groen"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 2, new Punt(3, 7), "paars"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 4, new Punt(5, 7), "oranje"));
        oppervlak.voegFiguurToe(new Rechthoek(5, 3, new Punt(5, 3), "blauw"));
        oppervlak.voegFiguurToe(new Cirkel(8));
        oppervlak.voegFiguurToe((new Rechthoek(11, 6)));
        System.out.println(oppervlak);
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
    }

    public static void toonInformatieAlleFiguren(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
            System.out.println();
        }
    }
}
