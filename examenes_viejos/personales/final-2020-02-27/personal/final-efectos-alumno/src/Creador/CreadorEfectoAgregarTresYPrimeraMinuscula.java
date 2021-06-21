package Creador;
import Efectos.*;

public class CreadorEfectoAgregarTresYPrimeraMinuscula extends CreadorEfecto {
    @Override
    protected Efecto crearEfecto() {
        return new EfectoAgregarTresYPrimeraMinuscula();
    }
}
