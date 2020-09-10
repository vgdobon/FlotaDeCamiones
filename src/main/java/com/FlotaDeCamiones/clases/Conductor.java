package com.FlotaDeCamiones.clases;

import com.FlotaDeCamiones.constants.Constantes;

public class Conductor {


    Constantes.Licencias licencia;

    public Conductor(Constantes.Licencias licencia){
        this.licencia = licencia;
    }

    public Constantes.Licencias getLicencia() {
        return licencia;
    }

    public void setLicencia(Constantes.Licencias licencia) {
        this.licencia = licencia;
    }
}
