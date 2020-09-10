package com.FlotaDeCamiones.vehiculos;

import com.FlotaDeCamiones.clases.Conductor;
import com.FlotaDeCamiones.clases.Paquete;
import com.FlotaDeCamiones.clases.Parada;
import com.FlotaDeCamiones.clases.Ruta;
import com.FlotaDeCamiones.constants.Constantes;

import java.util.ArrayList;

public class Vehiculo {

    ArrayList<Paquete> paquetes;



    Constantes.Licencias licencia;
    Conductor conductor;
    Ruta ruta;
    int maxPaquetes;

    public Vehiculo(Constantes.Licencias licencia,Conductor conductor,Ruta ruta,int maxPaquetes,ArrayList<Paquete> paquetes){
        this.licencia = licencia;
        this.conductor = conductor;
        this.ruta = ruta;
        this.maxPaquetes = maxPaquetes;
        this.paquetes = paquetes;
    }



    public void hacerRuta(){
        if(conductor.getLicencia().compareTo(getLicencia())>=0){
            for (Parada parada: this.ruta.getParadas()) {
                for (Paquete paquete: parada.getListaDePaquetesDeLaParada()) {
                    if (estaEnElVehiculo(paquete)){
                        System.out.println("Entregando: " + paquete.getNombre());
                        getPaquetes().remove(paquete);
                    } else {
                        System.out.println("El paquete de "+ paquete.getNombre()+" no está en el camion");
                    }
                }
            }
        }else{
            System.out.println("Este conductor no puede conducir este " + this.getClass());
        }
    }


    public boolean estaEnElVehiculo(Paquete paquete){
        for (Paquete paquetes: getPaquetes()
             ) {
            if(paquetes==paquete){
                return true;
            }
        }

        return false;
    }



    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public Constantes.Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Constantes.Licencias licencia) {
        this.licencia = licencia;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public int getMaxPaquetes() {
        return maxPaquetes;
    }

    public void setMaxPaquetes(int maxPaquetes) {
        this.maxPaquetes = maxPaquetes;
    }



}
