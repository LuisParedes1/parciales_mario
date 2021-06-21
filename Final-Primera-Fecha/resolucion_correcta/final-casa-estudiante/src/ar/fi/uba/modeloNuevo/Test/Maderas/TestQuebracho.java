package ar.fi.uba.modeloNuevo.Test.Maderas;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Quebracho;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuebracho {

    private final int PUREZA = 2;
    private final int PRECIO_KG = 4;

    @Test
    public void test01AlCrearUnQuebrachoDe1KgEn1MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 1;
        int metrosCuadrados = 1;
        int valorEsperado = metrosCuadrados * kg * PRECIO_KG * PUREZA;

        Quebracho quebracho = new Quebracho(kg);

        assertEquals(valorEsperado, quebracho.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test02AlCrearUnQuebrachoDe100KgEn10MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 100;
        int metrosCuadrados = 10;
        int valorEsperado = metrosCuadrados * kg * PRECIO_KG * PUREZA;

        Quebracho quebracho = new Quebracho(kg);

        assertEquals(valorEsperado, quebracho.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test03AlCrearUnQuebrachoDe0KgEn10MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 0;
        int metrosCuadrados = 10;
        int valorEsperado = metrosCuadrados * kg * PRECIO_KG * PUREZA;

        Quebracho quebracho = new Quebracho(kg);

        assertEquals(valorEsperado, quebracho.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test04AlCrearUnQuebrachoDe10KgEn0MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 10;
        int metrosCuadrados = 0;
        int valorEsperado = metrosCuadrados * kg * PRECIO_KG * PUREZA;

        Quebracho quebracho = new Quebracho(kg);

        assertEquals(valorEsperado, quebracho.getGastoTotal(metrosCuadrados));
    }

    @Test(expected = DatosInvalidos.class)
    public void test05AlCrearUnQuebrachoDeKgInvalidoEntoncesLanzaExcepcion(){

        int kg = -1;

        Quebracho quebracho = new Quebracho(kg);
    }
}
