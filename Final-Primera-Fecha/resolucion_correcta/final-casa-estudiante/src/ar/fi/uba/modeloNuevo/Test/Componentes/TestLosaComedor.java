package ar.fi.uba.modeloNuevo.Test.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Componentes.LosaRadiante;
import org.junit.Assert;
import org.junit.Test;

public class TestLosaComedor {

    @Test
    public void test01AlCrearUnaLosaDe10MetrosY10PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 10;
        int precioKw = 10;
        int precioEsperado = precioKw * metros * metros;

        LosaRadiante losa = new LosaRadiante(metros, precioKw);

        Assert.assertEquals(precioEsperado, losa.getGastoTotal());
    }

    @Test
    public void test02AlCrearUnaLosaDe20MetrosY10PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 20;
        int precioKw = 10;
        int precioEsperado = precioKw * metros * metros;

        LosaRadiante losa = new LosaRadiante(metros, precioKw);

        Assert.assertEquals(precioEsperado, losa.getGastoTotal());
    }


    @Test
    public void test03AlCrearUnaLosaDe10MetrosY20PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 10;
        int precioKw = 20;
        int precioEsperado = precioKw * metros * metros;

        LosaRadiante losa = new LosaRadiante(metros, precioKw);

        Assert.assertEquals(precioEsperado, losa.getGastoTotal());
    }

    @Test
    public void test04AlCrearUnaLosaDe0MetrosY20PrecioKwEntoncesCalculaElPrecioCorrecto(){
        int metros = 0;
        int precioKw = 20;
        int precioEsperado = precioKw * metros * metros;

        LosaRadiante losa = new LosaRadiante(metros, precioKw);

        Assert.assertEquals(precioEsperado, losa.getGastoTotal());
    }

    @Test(expected = DatosInvalidos.class)
    public void test05AlIngresarDatosInvalidosLanzaDatosInvalidosExcepcion(){
        int metros = -1;
        int precioKw = -1;

        LosaRadiante losa = new LosaRadiante(metros, precioKw);

    }
}
