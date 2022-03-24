/*Edwin Rodriguez Valle
Doel: Het doel van deze opdracht is om een applicatie te schrijven die de resultaten van een voetbalteam
inleest en op het scherm afdrukt. De resultaten bestaan uit een aantal wedstrijden. Dit zijn wedstrijden
die door hetzelfde team zijn gespeeld tegen verschillende tegenstanders, samen met de uitslag en
het totaal aantal gescoorde punten
Object Orientated Programing
*/

package controller;

//import model
import java.util.Scanner;
import model.Wedstrijd;

public class VoetbalScoreLauncher {
    public static void main(String[] args) {
        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);
        eersteWedstrijd.imprimirElResultado();
        eersteWedstrijd.imprimirLosPuntos();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("What is the tegen stander? ");
        String nombreDelEquipoContrincante = input.next();

        Wedstrijd teedeWedstrijd = new Wedstrijd(nombreDelEquipoContrincante);
        System.out.print("Goles a favor: ");
        teedeWedstrijd.golesAFavor = input.nextInt();
        teedeWedstrijd.imprimirElResultado();
        teedeWedstrijd.imprimirLosPuntos();

    }
}
