package org.example;

public abstract class Fahrzeug {
    private int anzahl_sitzpleatze;
    private boolean mietstatus;
    private String kennzeichen;

    public Fahrzeug(int anzahl_sitzpleatze, boolean mietstatus, String kennzeichen) {
        this.anzahl_sitzpleatze = anzahl_sitzpleatze;
        this.mietstatus = mietstatus;
        this.kennzeichen = kennzeichen;
    }

    public Fahrzeug() {
    }


    public int getAnzahl_sitzpleatze() {
        return  anzahl_sitzpleatze;
    }

    public void setAnzahl_sitzpleatze(int anzahl_sitzpleatze) {
        this.anzahl_sitzpleatze = anzahl_sitzpleatze;
    }

    public boolean getMietstatus() {
        return mietstatus;
    }

    public void setMietstatus(boolean mietstatus) {
        this.mietstatus = mietstatus;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }


    public abstract double berechneMietPreisProTag();
}



