package org.lessons.flotta.veicoli;

public class Automobile extends Veicolo{

    //ATTRIBUTI
    private int numeroPorte;

    //Costruttore
    public Automobile(String targa, int annoImmatricolazione, int numeroPorte) {
        super(targa, annoImmatricolazione);
        this.numeroPorte=numeroPorte;
    }

    //GETTER SETTER

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }


    //METODI

    public String toString() {
        return ("Veicolo: " + "Targa: " + getTarga() +"\n"
                +"Anno di Immatricolazione: " + getAnnoImmatricolazione())
                +"Numero di Porte: " + getNumeroPorte();
    }
}
