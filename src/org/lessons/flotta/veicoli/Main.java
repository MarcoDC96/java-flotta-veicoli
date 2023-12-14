package org.lessons.flotta.veicoli;

public class Main {
    public static void main(String[] args) {
    FlottaVeicoli gestoreFlotta = new FlottaVeicoli();
    Automobile Peugeot208 = new Automobile("AX666CV", 2014, 5);
    gestoreFlotta.aggiungiVeicolo(Peugeot208);
    System.out.println(gestoreFlotta.contatore());
    Motocicletta Suzuki420 = new Motocicletta("AZ567BN", 2020, true);
    gestoreFlotta.aggiungiVeicolo(Suzuki420);
        System.out.println(gestoreFlotta.contatore());

    }
}
