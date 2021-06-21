package Creador;
import Efectos.*;

public class CreadorEfectoDarVueltaYPrimeraMayuscula extends CreadorEfecto {
    @Override
    protected Efecto crearEfecto() {
        return new EfectoDarVueltaYPrimeraMayuscula();
    }
}
