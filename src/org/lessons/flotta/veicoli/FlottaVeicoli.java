package org.lessons.flotta.veicoli;

import java.util.ArrayList;

public class FlottaVeicoli {
    private ArrayList<Veicolo> veicoli = new ArrayList<>();


    public void aggiungiVeicolo(Veicolo veicolo) {
        if (!veicoli.contains(veicolo)) {
            veicoli.add(veicolo);
        } else {
            System.out.println("Non puoi aggiungere questo veicolo " + veicolo.getTarga() + " già esiste");
        }

    }
    public String contatore(){
        int contatoreAuto = 0;
        int contatoreMoto = 0;
        for(Veicolo veicoli2 : veicoli){
            if(veicoli2 instanceof Automobile){
                contatoreAuto++;
            } else if(veicoli2 instanceof Motocicletta){
                contatoreMoto++;
            }
        }
        return "Numero auto: " + contatoreAuto + "Numero moto: " + contatoreMoto;
    }

    public Veicolo ricercaVeicolo(String targa){
        Veicolo trovato = null;
        for (Veicolo veicoli : veicoli){
            if(veicoli.getTarga().equals(targa)){
                trovato = veicoli;
            }
        }
        return trovato;
    }


}

