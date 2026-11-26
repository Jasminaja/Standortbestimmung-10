package org.example;

public class Auto extends Fahrzeug implements Versicherbar{

    public Auto(int anzahl_sitzpleatze, boolean mietstatus, String kennzeichen) {
        super(anzahl_sitzpleatze, mietstatus,kennzeichen);
    }

    @Override
    public double berechneVersicherungsPreamie() {
        return 200 + getAnzahl_sitzpleatze() * 0.05;
    }

    @Override
    public double berechneMietPreisProTag() {
        return 30 + getAnzahl_sitzpleatze() * 5;
    }
}
