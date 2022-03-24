package FiguraLauncher;

import modelo.Figura;
import modelo.Circulo;
import modelo.Punto;

import java.sql.SQLOutput;


public class FiguraLauncher {
    public static void main(String[] args) {
        Figura f = new Figura();
        Circulo c = new Circulo();

        System.out.println( f.toString());
        System.out.println("Que pasa desde aquí");
        System.out.println( c.toString());


    }



}
