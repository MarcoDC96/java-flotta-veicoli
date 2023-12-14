package org.lessons.flotta.veicoli;

public class Motocicletta extends Veicolo{
    private boolean cavalletto;

    public Motocicletta(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto=cavalletto;
    }


    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }

    public String cavallettoSiNo(){
        if(cavalletto){
            return "Ha il cavalletto";
        } else {
            return"Non ha il cavalletto";
        }

    }

    public String toString() {
        return ("Veicolo: " + "Targa: " + getTarga() +"\n"
                +"Anno di Immatricolazione: " + getAnnoImmatricolazione())
                +"Cavalletto: " + cavallettoSiNo();
    }
}
