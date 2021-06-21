package Efectos;

import java.util.Arrays;

public class EfectoAgregarTresYPrimeraMinuscula extends EfectoCompuesto {
    @Override
    protected void agregarEfectos() {
        efectos = Arrays.asList(new EfectoAgregarTresAlFinal(), new EfectoPrimeraMinuscula());
    }
}
