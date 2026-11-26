package org.example;

import javax.print.DocFlavor;
import java.lang.classfile.attribute.SignatureAttribute;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Autovermietung vermietung = new Autovermietung();
        Auto auto1 = new Auto(4,false,"ZG123987");
        Motorad motorad1 = new Motorad(1,false,"ZH1276984");
        Auto auto2 = new Auto(7,false,"LU3829863");

        vermietung.fahrzeugHinzufuegen(auto1);
        vermietung.fahrzeugHinzufuegen(motorad1);
        vermietung.fahrzeugHinzufuegen(auto2);
        java.util.Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while(weiter){
            System.out.println("=== Autovermietung Menü ===");
            System.out.println("1) Alle Fahrzeuge anzeigen");
            System.out.println("2) Fahrzeuge mieten anhand Kennzeichen");
            System.out.println("3) Fahrzeuge zurückgeben anhand Kenzeichen");
            System.out.println("0) Beenden");
            System.out.println("Auswahl: ");

            String eingabe = scanner.nextLine();

            switch (eingabe){
                case "1":
                    vermietung.alleFahrzeugeAnzeigen();
                    break;
                case "2":
                    System.out.println("Kennzeichen eingeben: ");
                    String kennzeichenMieten = scanner.nextLine();
                    Fahrzeug fahrzeugMiete = vermietung.suchNachKennzeichen(kennzeichenMieten);
                    if(fahrzeugMiete == null){
                        System.out.println("Fahrzeug wurde nicht gefunden. ");
                    }else if(fahrzeugMiete.getMietstatus()){
                        System.out.println("Fahrzeug ist bereits vermietet.");
                }else{
                        fahrzeugMiete.setMietstatus(true);
                        System.out.println("Fahrzeug wurde vermietet.");
                        System.out.println("Mietpreis pro Tag : " + fahrzeugMiete.berechneMietPreisProTag());
                    }
                    break;
                case "3":
                    System.out.println("Kennzeichen eingeben: ");
                    String kennzeichenZurueck = scanner.nextLine();
                    Fahrzeug fahrzeugZurueck = vermietung.suchNachKennzeichen(kennzeichenZurueck);
                    if(fahrzeugZurueck == null){
                        System.out.println("Fahrzeug wurde nicht gefunden.");
                    } else if (fahrzeugZurueck.getMietstatus()) {
                        System.out.println("Fahrzeug ist nicht vermietet.");
                    }else {
                        fahrzeugZurueck.getMietstatus();
                        System.out.println("Fahrzeug wurde zurückgegeben.");
                    }
                    break;
                case "0":
                    weiter = false;
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige Eingabe, bitte erneut versuchen.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
