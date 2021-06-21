package Creador;
import Efectos.*;

public class CreadorEfectoPrimeraMayuscula extends CreadorEfecto{

    @Override
    protected Efecto crearEfecto() {
        return new EfectoPrimeraMayuscula();
    }
}
