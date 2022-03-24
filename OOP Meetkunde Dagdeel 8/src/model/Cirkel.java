package model;

public class Cirkel extends Figuur {
    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULTWAARDE_KLEUR);
    }

    public Cirkel() {
        this(1);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal <= breedte / 2;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) throws IllegalArgumentException {
        if (straal <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn.");
        }
        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStraal: " + straal + "\nMiddelpunt: " + middelpunt.toString();
    }
}

