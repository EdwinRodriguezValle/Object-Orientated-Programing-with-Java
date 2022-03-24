package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Daagdeel9Launcher {
    public static void main(String[] args) {
        File rechthhoekBestand = new File("resources/Rechthoek.csv");

        try{
            Scanner bestandLezer = new File(rechthhoekBestand);
            while (bestandLezer.hasNextLine());
        } catch(FileNotFoundException nietGevonden){
            System.out.println();
        }
    }
}
