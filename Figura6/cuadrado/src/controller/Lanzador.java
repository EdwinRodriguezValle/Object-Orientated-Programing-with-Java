package controller;

import modelo.Triangulo;

public class Lanzador {
    public static void main(String[] args) {
        Triangulo miPrimerEjercicio = new Triangulo(4, 5 , 6, "amarrillo" );

        Triangulo miLado = new Triangulo(10);
        System.out.println(miLado.calculadorDeArea());

    }
}
