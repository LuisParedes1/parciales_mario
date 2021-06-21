package ar.fi.uba.modeloNuevo.Test.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Componentes.CercoElectrico;
import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import org.junit.Assert;
import org.junit.Test;

public class TestCercoElectrico {

    @Test
    public void test01AlCrearUnCercoElectricoDe10MetrosY10PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 10;
        int precioKw = 10;
        int precioEsperado = precioKw * metros;

        CercoElectrico cercoElectrico = new CercoElectrico(metros, precioKw);

        Assert.assertEquals(precioEsperado, cercoElectrico.getGastoTotal());
    }

    @Test
    public void test02AlCrearUnCercoElectricoDe210MetrosY10PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 210;
        int precioKw = 10;
        int precioEsperado = precioKw * metros;

        CercoElectrico cercoElectrico = new CercoElectrico(metros, precioKw);

        Assert.assertEquals(precioEsperado, cercoElectrico.getGastoTotal());
    }

    @Test
    public void test03AlCrearUnCercoElectricoDe0MetrosY10PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 0;
        int precioKw = 10;
        int precioEsperado = precioKw * metros;

        CercoElectrico cercoElectrico = new CercoElectrico(metros, precioKw);

        Assert.assertEquals(precioEsperado, cercoElectrico.getGastoTotal());
    }

    @Test(expected = DatosInvalidos.class)
    public void test04AlIngresarDatosInvalidosLanzaDatosInvalidosExcepcion(){
        int metros = -1;
        int precioKw = 10;

        CercoElectrico cercoElectrico = new CercoElectrico(metros, precioKw);
    }
}
