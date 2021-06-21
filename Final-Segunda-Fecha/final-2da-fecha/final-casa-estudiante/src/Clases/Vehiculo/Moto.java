package Clases.Vehiculo;

import Clases.Exceptions.MotoNoPuedeEquiparPortaBiciException;
import Clases.Portador.CargadorHelatodo;
import Clases.Portador.Portador;

public class Moto extends Vehiculo{
    public Moto(){
        this.portador = new CargadorHelatodo();
    }

    @Override
    public void cambiarPortador(Portador portadorNuevo) {
        throw new MotoNoPuedeEquiparPortaBiciException();
    }
}
