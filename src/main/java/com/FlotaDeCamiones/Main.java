package com.FlotaDeCamiones;

import com.FlotaDeCamiones.clases.Conductor;
import com.FlotaDeCamiones.clases.Paquete;
import com.FlotaDeCamiones.clases.Parada;
import com.FlotaDeCamiones.clases.Ruta;
import com.FlotaDeCamiones.vehiculos.Camion;
import com.FlotaDeCamiones.vehiculos.Vehiculo;
import com.FlotaDeCamiones.constants.Constantes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Paquete> listaDePaquetesParada = new ArrayList<Paquete>();
        ArrayList<Paquete> listaDePaquetesParada2 = new ArrayList<Paquete>();
        ArrayList<Paquete> listaDePaquetesParada3 = new ArrayList<Paquete>();

        Paquete paquete1=new Paquete("Lavadora");
        Paquete paquete2=new Paquete("Frigorifico");
        Paquete paquete3=new Paquete("Televisión");
        Paquete paquete4=new Paquete("Play Station 5");
        Paquete paquete5=new Paquete("Reloj");

        listaDePaquetesParada.add(paquete5);
        listaDePaquetesParada.add(paquete4);
        listaDePaquetesParada2.add(paquete3);
        listaDePaquetesParada2.add(paquete2);
        listaDePaquetesParada3.add(paquete1);



        Parada parada1=new Parada(listaDePaquetesParada);
        Parada parada2 = new Parada(listaDePaquetesParada2);
        Parada parada3 = new Parada(listaDePaquetesParada3);

        ArrayList<Parada> listaDeParadas = new ArrayList<Parada>();

        listaDeParadas.add(parada1);
        listaDeParadas.add(parada2);
        listaDeParadas.add(parada3);

        Ruta ruta= new Ruta(listaDeParadas);

        ArrayList<Paquete> listaDePaquetesParaElVehiculo= new ArrayList<Paquete>();

        listaDePaquetesParaElVehiculo.add(paquete1);
        listaDePaquetesParaElVehiculo.add(paquete2);
        listaDePaquetesParaElVehiculo.add(paquete3);
        listaDePaquetesParaElVehiculo.add(paquete4);
//        listaDePaquetesParaElVehiculo.add(paquete5);

        Conductor conductor = new Conductor(Constantes.Licencias.B);

        Camion camion = new Camion(conductor,ruta,20,listaDePaquetesParaElVehiculo);

        camion.hacerRuta();





    }
}
