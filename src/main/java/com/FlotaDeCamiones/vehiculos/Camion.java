package com.FlotaDeCamiones.vehiculos;

import com.FlotaDeCamiones.clases.Conductor;
import com.FlotaDeCamiones.clases.Paquete;
import com.FlotaDeCamiones.clases.Ruta;
import com.FlotaDeCamiones.constants.Constantes;

import java.util.ArrayList;

public class Camion extends Vehiculo {


    public Camion( Conductor conductor, Ruta ruta, int maxPaquetes, ArrayList<Paquete> paquetes) {
        super(Constantes.Licencias.C, conductor, ruta, maxPaquetes, paquetes);
    }
}
