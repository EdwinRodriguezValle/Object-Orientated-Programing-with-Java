package model;

public class Werknemer extends Persoon {
    private final static double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        this.setMaandSalaris(maandSalaris);
    }

    public Werknemer(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling(), 0.0);
    }

    public Werknemer() {
        this(DEFAULTWAARDE_NAAM);
    }
    
    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    @Override
    public double berekenJaarInkomen() {
        if (heeftRechtOpBonus()) {
            return 13 * maandSalaris;
        } else {
            return 12 * maandSalaris;
        }
    }

    @Override
    public String toString() {
        String rechtOpBonus;
        if (heeftRechtOpBonus()) {
            rechtOpBonus = " met recht op een bonus" ;
        } else {
            rechtOpBonus = " zonder recht op een bonus";
        }
        return super.toString() + " en is een werknemer" + rechtOpBonus ;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double maandSalaris) throws IllegalArgumentException {
        if (maandSalaris < 0) {
            throw new IllegalArgumentException("Het maandsalaris mag niet negatief zijn");
        }
            this.maandSalaris = maandSalaris;
    }
}
