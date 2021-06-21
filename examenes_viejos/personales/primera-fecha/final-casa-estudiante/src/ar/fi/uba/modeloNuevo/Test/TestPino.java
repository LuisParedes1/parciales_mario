package ar.fi.uba.modeloNuevo.Test;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Pino;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPino {

    private final int COEFICIENTE_CALORICO = 3;
    private final int PRECIO_KG = 2;

    @Test
    public void test01AlCrearUnPinoDe1KgEn1MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 1;
        int metrosCuadrados = 1;
        int valorEsperado =  (metrosCuadrados * kg * PRECIO_KG ) / COEFICIENTE_CALORICO;

        Pino pino = new Pino(kg);

        assertEquals(valorEsperado, pino.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test02AlCrearUnPinoDe100KgEn10MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 100;
        int metrosCuadrados = 10;
        int valorEsperado =  (metrosCuadrados * kg * PRECIO_KG ) / COEFICIENTE_CALORICO;

        Pino pino = new Pino(kg);

        assertEquals(valorEsperado, pino.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test03AlCrearUnPinoDe0KgEn10MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 0;
        int metrosCuadrados = 10;
        int valorEsperado =  (metrosCuadrados * kg * PRECIO_KG ) / COEFICIENTE_CALORICO;

        Pino pino = new Pino(kg);

        assertEquals(valorEsperado, pino.getGastoTotal(metrosCuadrados));
    }

    @Test
    public void test04AlCrearUnPinoDe10KgEn0MetroCuadradoEntoncesCalculaSuConsumoCorrectamente(){

        int kg = 10;
        int metrosCuadrados = 0;
        int valorEsperado =  (metrosCuadrados * kg * PRECIO_KG ) / COEFICIENTE_CALORICO;

        Pino pino = new Pino(kg);

        assertEquals(valorEsperado, pino.getGastoTotal(metrosCuadrados));
    }

    @Test(expected = DatosInvalidos.class)
    public void test05AlCrearUnPinoDeKgInvalidoEntoncesLanzaExcepcion(){

        int kg = -1;

        Pino pino = new Pino(kg);
    }


}
