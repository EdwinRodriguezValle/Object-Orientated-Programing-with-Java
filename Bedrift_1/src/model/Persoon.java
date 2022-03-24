package model;

public class Persoon {
    public static int aantalPersonen;
    public int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;

    public Persoon(String naam, String woonplaats, double maandSalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon() {
        this.naam = "Onbekend";
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }
}
