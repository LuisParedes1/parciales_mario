package Creador;
import Efectos.*;

public class CreadorEfectoPrimeraMayusculaYAgregarOcho extends CreadorEfecto {
    @Override
    protected Efecto crearEfecto() {
        return new EfectoPrimeraMayusculaYAgregarOcho();
    }
}
