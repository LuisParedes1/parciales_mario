package Efectos;

import java.util.Arrays;

public class EfectoPrimeraMayusculaYAgregarOcho extends EfectoCompuesto{

    @Override
    protected void agregarEfectos() {
        efectos = Arrays.asList(new EfectoPrimeraMayuscula(), new EfectoAgregarOchoAlFinal());
    }
}
