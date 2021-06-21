package Clases.Vehiculo;


import Clases.Portador.CargadorHelatodo;
import Clases.Portador.Portador;

public class Auto extends Vehiculo{

    public Auto(){
        this.portador = new CargadorHelatodo();
    }

    @Override
    public void cambiarPortador(Portador portadorNuevo) {
        this.portador = portadorNuevo;
    }
}
