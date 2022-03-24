package controller;

import model.Vestiging;
import model.Auto;
import java.time.LocalDate;
import java.util.ArrayList;

public class AutoLauncher {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Tesla", "S100D", LocalDate.of(2022,5, 5), 12646, "TR-264-X");
    }
}
