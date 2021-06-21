package Efectos;

import java.util.Arrays;

public class EfectoDarVueltaYPrimeraMayuscula extends EfectoCompuesto{

    @Override
    protected void agregarEfectos() {
        efectos = Arrays.asList(new EfectoDarVuelta(), new EfectoPrimeraMayuscula());
    }
}
