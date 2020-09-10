package com.FlotaDeCamiones.clases;

import java.util.ArrayList;
import java.util.List;

public class Parada {

    ArrayList<Paquete> listaDePaquetesDeLaParada;

    public Parada(ArrayList<Paquete> paquetes){
        this.listaDePaquetesDeLaParada = paquetes;

    }

//    public void entregarPaquetesDeParada(ArrayList<Paquete> listaDePaquetesDeLaParada){
//
//    }



    public ArrayList<Paquete> getListaDePaquetesDeLaParada() {
        return listaDePaquetesDeLaParada;
    }

    public void setListaDePaquetesDeLaParada(ArrayList<Paquete> listaDePaquetesDeLaParada) {
        this.listaDePaquetesDeLaParada = listaDePaquetesDeLaParada;
    }

}
