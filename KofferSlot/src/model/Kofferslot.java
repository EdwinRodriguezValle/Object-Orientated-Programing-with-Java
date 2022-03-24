package model;

public class Kofferslot {
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        setCombinatie(eersteLetter, tweedeLetter, cijfer);
    }

    /**
     * Instellen slotcombinatie van Kofferslot
     *
     * @param eersteLetter
     * @param tweedeLetter
     * @param cijfer
     */

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setEersteLetter(eersteLetter);
        this.setTweedeLetter(tweedeLetter);
        this.setCijfer(cijfer);
    }

    public char volgendeLetter(char letter) {
        if (letter == 'Z') {
            return 'A';
        } else {
            return ++letter;
        }
    }

    public int volgendeCijfer(int cijfer) {
        if (cijfer == 9) {
            return 0;
        } else {
            return ++cijfer;
        }
    }

    /**
     * Volgende slotcombinatie draait eerste cijfer verder.
     * Indien cijfer weer 0 wordt, ook tweede letter uit letterlijst verder draaien.
     * Indien tweede letter weer A wordt, ook eerste letter uit letterlijst verder draaien.
     */

    public void volgende() {
        cijfer = volgendeCijfer(cijfer);
        if (cijfer == 0) {
            tweedeLetter = volgendeLetter(tweedeLetter);
            if (tweedeLetter == 'A') {
                eersteLetter = volgendeLetter(eersteLetter);
            }
        }
    }

    public char getEersteLetter() {
        return eersteLetter;
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

}
