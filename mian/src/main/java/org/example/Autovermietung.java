package org.example;

import java.util.ArrayList;

public class Autovermietung {

    ArrayList<Fahrzeug> liste = new ArrayList<>();


    public void fahrzeugHinzufuegen(Fahrzeug fahrzeug){
        liste.add(fahrzeug);
    }

    public void alleFahrzeugeAnzeigen(){
        for (Fahrzeug fahrzeug : liste){
            System.out.println("Anzahl Sitzplätzte: " + fahrzeug.getAnzahl_sitzpleatze());
            System.out.println("Mietstatus: " + fahrzeug.getMietstatus());
            System.out.println("Der Mietpreis pro Tag: " + fahrzeug.berechneMietPreisProTag());
            System.out.println("------------------------------------");

        }
    }
    public boolean pruefeObFahrzeugVermietet(String kennzeichen){
        Fahrzeug fahrzeug = suchNachKennzeichen(kennzeichen);
        if(fahrzeug!= null){
            return fahrzeug.getMietstatus();
        }
        return false;
    }
    public Fahrzeug suchNachKennzeichen(String kennzeichen){
        for (Fahrzeug fahrzeug : liste){
            if(fahrzeug.getKennzeichen().equals(kennzeichen)){
                return fahrzeug;
            }
        }
        return null;
    }
}
