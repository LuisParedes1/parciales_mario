package Creador;
import Efectos.*;

public abstract class CreadorEfecto {

    public Efecto obtenerValor(){
        return crearEfecto();
    }

    protected abstract Efecto crearEfecto();
}
