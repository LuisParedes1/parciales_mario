package ar.uba.fi.modeloNuevo.Test;

import ar.uba.fi.modeloNuevo.Clases.CadenaVaciaException;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoAgregarTresAlFinalYPrimeraMinuscula;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoDarVueltasYPrimeraMayuscula;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoPrimeroMayusculaYAgregarOcho;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.*;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarCincoAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarCuatroAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarOchoAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarTresAlFinal;
import org.junit.Test;

public class TestExcepciones {

    private final String CADENA_VACIA = "";

    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoDarVueltaYPrimeraMayusculaLanzaCadenaVaciaException(){
        String cadena = new EfectoDarVueltasYPrimeraMayuscula().aplicarA(CADENA_VACIA);
    }


    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoPrimeroMayusculaYAgregarOchoLanzaCadenaVaciaException(){
        String cadena = new EfectoPrimeroMayusculaYAgregarOcho().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoPrimeroMayusculaLanzaCadenaVaciaException(){
        String cadena = new EfectoPrimeroMayuscula().aplicarA(CADENA_VACIA);
    }


    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoDarVueltaLanzaCadenaVaciaException(){
        String cadena = new EfectoDarVueltas().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoAgregarOchoLanzaCadenaVaciaException(){
        String cadena = new EfectoAgregarOchoAlFinal().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testAlPasarUnaCadenaVaciaAEfectoAgregarCincoLanzaCadenaVaciaException(){
        String cadena = new EfectoAgregarCincoAlFinal().aplicarA(CADENA_VACIA);
    }

    // Efectos Nuevos

    @Test(expected = CadenaVaciaException.class)
    public void testAgregar3AlFinal(){
        String cadena = new EfectoAgregarTresAlFinal().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testAgregarPrimeraMinuscula(){
        String cadena = new EfectoPrimeraMinuscula().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testAgregar3AlFinalYLuegoPrimeraMinuscula(){
        String cadena = new EfectoAgregarTresAlFinalYPrimeraMinuscula().aplicarA(CADENA_VACIA);
    }


    @Test(expected = CadenaVaciaException.class)
    public void testEfectoAgregar4AlFinal(){
        String cadena = new EfectoAgregarCuatroAlFinal().aplicarA(CADENA_VACIA);
    }

    @Test(expected = CadenaVaciaException.class)
    public void testEfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregar4AlFinal(){
        String cadena = new EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal().aplicarA(CADENA_VACIA);
    }
}
