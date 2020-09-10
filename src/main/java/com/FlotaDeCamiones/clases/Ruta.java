package com.FlotaDeCamiones.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Ruta {



    ArrayList<Parada> paradas;

    public Ruta(ArrayList<Parada> paradas){

        this.paradas = paradas;
    }

    public void meterParadaALaRuta(Parada parada){
        paradas.add(parada);
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }
}
