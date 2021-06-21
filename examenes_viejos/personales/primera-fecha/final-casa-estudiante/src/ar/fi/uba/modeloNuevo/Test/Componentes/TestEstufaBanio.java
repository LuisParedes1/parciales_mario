package ar.fi.uba.modeloNuevo.Test.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Componentes.Estufa;
import org.junit.Assert;
import org.junit.Test;

public class TestEstufaBanio {

    @Test
    public void test01AlCrearUnaEstufaDe1AmbienteCon1000DeCaloriasY10PrecioKwEntoncesCalculaCorrectamenteElCosto(){
        int ambientes = 1;
        int calorias = 1000;
        int precioKw = 10;
        int precioEsperado = ambientes * precioKw * calorias;

        Estufa estufa = new Estufa(ambientes, calorias, precioKw);

        Assert.assertEquals(precioEsperado, estufa.getGastoTotal());
    }

    @Test
    public void test02AlCrearUnaEstufaDe3AmbienteCon2000DeCaloriasY10PrecioKwEntoncesCalculaCorrectamenteElCosto(){
        int ambientes = 3;
        int calorias = 2000;
        int precioKw = 10;
        int precioEsperado = ambientes * precioKw * calorias;

        Estufa estufa = new Estufa(ambientes, calorias, precioKw);

        Assert.assertEquals(precioEsperado, estufa.getGastoTotal());
    }

    @Test
    public void test03AlCrearUnaEstufaDe0AmbienteCon1000DeCaloriasY10PrecioKwEntoncesCalculaCorrectamenteElCosto(){
        int ambientes = 0;
        int calorias = 2000;
        int precioKw = 10;
        int precioEsperado = ambientes * precioKw * calorias;

        Estufa estufa = new Estufa(ambientes, calorias, precioKw);

        Assert.assertEquals(precioEsperado, estufa.getGastoTotal());
    }

    @Test(expected = DatosInvalidos.class)
    public void test04AlIngresarDatosInvalidosLanzaDatosInvalidosExcepcion(){
        int ambientes = -1;
        int calorias = -1;
        int precioKw = 1;

        Estufa estufa = new Estufa(ambientes, calorias, precioKw);
    }
}
