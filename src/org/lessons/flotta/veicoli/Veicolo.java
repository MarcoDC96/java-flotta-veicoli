package org.lessons.flotta.veicoli;

import java.time.LocalDate;

public abstract class Veicolo {
    //Attributi
    private String targa;
    private int annoImmatricolazione;

    //Costruttore

    public Veicolo(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }


    //Getter Setter

    public String getTarga() {
        return targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    //Metodi
    @Override
    public String toString() {
        return ("Veicolo: " + "Targa: " + getTarga() +"\n"
                +"Anno di Immatricolazione: " + getAnnoImmatricolazione());
    }
}
