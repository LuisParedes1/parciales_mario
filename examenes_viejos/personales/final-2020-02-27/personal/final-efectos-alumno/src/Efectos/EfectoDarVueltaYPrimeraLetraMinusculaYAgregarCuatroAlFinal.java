package Efectos;

import java.util.Arrays;

public class EfectoDarVueltaYPrimeraLetraMinusculaYAgregarCuatroAlFinal extends EfectoCompuesto {
    @Override
    protected void agregarEfectos() {
        efectos = Arrays.asList(new EfectoDarVuelta(), new EfectoPrimeraMinuscula(), new EfectoAgregarCuatroAlFinal() );
    }
}
