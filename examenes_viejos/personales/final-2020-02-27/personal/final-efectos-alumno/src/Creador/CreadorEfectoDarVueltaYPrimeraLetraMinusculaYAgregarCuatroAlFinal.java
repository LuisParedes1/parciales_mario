package Creador;
import Efectos.*;

public class CreadorEfectoDarVueltaYPrimeraLetraMinusculaYAgregarCuatroAlFinal extends CreadorEfecto {
    @Override
    protected Efecto crearEfecto() {
        return new EfectoDarVueltaYPrimeraLetraMinusculaYAgregarCuatroAlFinal();
    }
}
