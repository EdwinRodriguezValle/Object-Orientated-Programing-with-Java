package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

public class Luancher {
    public static void main(String[] args) {

        Rechthoek r = new Rechthoek(1, 1, new Punt(1,1), "azul" );

        System.out.println(r.toString());

        System.out.println("Aquí se divide");

        Rechthoek r5 = new Rechthoek(2, 4);
        System.out.println(r5);

        System.out.println("Aquí se divide.");

        Rechthoek r1 = new Rechthoek();
        System.out.println(r1);


    }
}
