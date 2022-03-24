package model;

import java.time.LocalDate;

public class Auto implements Comparable <Auto> {

    //Attribute
    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometersstand;
    private String kenteken;


    //Constructor
    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometersstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometersstand = kilometersstand;
        this.kenteken = kenteken;
    }

    public int compareTo(Auto andereAuto){
        return this.datumAfgifteKenteken.compareTo
                (andereAuto.datumAfgifteKenteken);
    }

    @Override
    public String toString() {
        return String.format("Merk: %s \nModel: %s " +
                        "\nDatum kenteken: %n \nKilometerstand:%d" +
                        "\nKenteken: %s\n",
                merk, model, datumAfgifteKenteken, kilometersstand, kenteken);
    }

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }
}
