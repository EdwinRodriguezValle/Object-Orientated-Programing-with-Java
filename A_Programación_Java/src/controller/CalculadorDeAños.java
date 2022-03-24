package controller;

import  java.util.Scanner;

public class CalculadorDeAños {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ano_actual = 2022;

        System.out.println("Cómo te llamas?");
        String nombre = input.nextLine();

        System.out.println("En que ano naciste?");
        int nacimiento = input.nextInt();

        int edad = ( ano_actual- nacimiento);

        System.out.println("Estimado  " +  nombre + " tu edad es:  " + edad + "\n chao bobo!!");

    }


}
