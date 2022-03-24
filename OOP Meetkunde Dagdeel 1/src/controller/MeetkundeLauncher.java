package controller;

import model.Cirkel;

public class MeetkundeLauncher {
    public static void main(String[] args) {
        System.out.println(Cirkel.geefDefinitie());
        //Este es un constructor. En este caso en Cirkel vas a construir un subobjeto que se llama mijnAallargsCirkel
        //que va igualar a nuevo Cirkel. Aquí jala en automatico los atributos definidos en el modelo u objeto. Aquí se le puede
        //Asignar valores a cada objeto para que haga el calculo.

        Cirkel mijnAllArgsCirkel = new Cirkel(3,1,4, "groen_puerto");
        System.out.println(mijnAllArgsCirkel.damePeriferia());
         Cirkel mijDefualt = new Cirkel();
        System.out.println(mijDefualt.damePeriferia());

        Cirkel mijnStraalCirkel = new Cirkel(10);
        System.out.println(mijnStraalCirkel.straal);
        System.out.println(mijnStraalCirkel.geefOppervlakte());

    }
}
