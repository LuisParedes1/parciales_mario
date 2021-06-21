package Clases.Vehiculo;

import Clases.Carga.Carga;
import Clases.Portador.Portador;

public abstract class Vehiculo {

    protected Portador portador;

    public void cargar(Carga carga) {
        this.portador.cargar(carga);
    }

    public Carga descargar() {
        return portador.descargar();
    }

    public abstract void cambiarPortador(Portador portadorNuevo);
}
