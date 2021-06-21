package ar.uba.fi.modeloNuevo.Test;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoAgregarTresAlFinalYPrimeraMinuscula;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoDarVueltasYPrimeraMayuscula;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos.EfectoPrimeroMayusculaYAgregarOcho;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.*;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarCincoAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarCuatroAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarOchoAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarTresAlFinal;
import org.junit.Assert;
import org.junit.Test;

public class TestEfectos {

    @Test
    public void testAgregarCincoAlFinal() {
        String cadena = new EfectoAgregarCincoAlFinal().aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        String cadena = new EfectoAgregarOchoAlFinal().aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYDevuelveLaCadenaCorrecta() {
        String cadena = new EfectoDarVueltas().aplicarA("algo");
        Assert.assertEquals("ogla", cadena);
    }

    @Test
    public void testPrimeraMayusculaYDevuelveLaCadenaCorrecta() {
        String cadena = new EfectoPrimeroMayuscula().aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        String cadena = new EfectoDarVueltasYPrimeraMayuscula().aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        String cadena = new EfectoPrimeroMayusculaYAgregarOcho().aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    // Nuevos Efectos


    @Test
    public void testAgregar3AlFinal(){
        String cadena = new EfectoAgregarTresAlFinal().aplicarA("algo");
        Assert.assertEquals("algo3", cadena);
    }

    @Test
    public void testAgregarPrimeraMinuscula(){
        String cadena = new EfectoPrimeraMinuscula().aplicarA("ALGO");
        Assert.assertEquals("aLGO", cadena);
    }

    @Test
    public void testAgregar3AlFinalYLuegoPrimeraMinuscula(){
        String cadena = new EfectoAgregarTresAlFinalYPrimeraMinuscula().aplicarA("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }


    @Test
    public void testEfectoAgregar4AlFinal(){
        String cadena = new EfectoAgregarCuatroAlFinal().aplicarA("ALGO");
        Assert.assertEquals("ALGO4", cadena);
    }

    @Test
    public void testEfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregar4AlFinal(){
        String cadena = new EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal().aplicarA("ALGO");
        Assert.assertEquals("oGLA4", cadena);
    }
}
