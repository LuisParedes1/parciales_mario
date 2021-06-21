package nuevoModelo.Tests;


import nuevoModelo.Clases.*;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestPitufos {

    @Test
    public void testUnaGaseosaDeCosto100AlPedirElPrecioEnPesosEntoncesDevuelve100(){
        Gaseosa gaseosa = new Gaseosa();
        Moneda pesos = new Peso();

        int costoLitro = 100;
        int numeroLitros = 200;
        double valorEsperado = 100.0;

        gaseosa.setCosto(costoLitro);

        double renta = gaseosa.getPrecio(numeroLitros, pesos);

        assertEquals(valorEsperado, renta);
    }

    @Test
    public void testUnaGaseosaDeCosto100AlPedirElPrecioEnDolaresEntoncesDevuelve400(){
        Gaseosa gaseosa = new Gaseosa();
        Moneda dolares = new Dolar();

        int costoLitro = 100;
        int numeroLitros = 10;
        double valorEsperado = 400.0;

        gaseosa.setCosto(costoLitro);

        double renta = gaseosa.getPrecio(numeroLitros, dolares);

        assertEquals(valorEsperado, renta);
    }

    @Test
    public void testAlCrearUnProductoDosPorUnoEntoncesDevuelveElPrecioCorrecto(){
        Gaseosa gaseosa01 = new Gaseosa();
        Gaseosa gaseosa02 = new Gaseosa();

        DosPorUno combo = new DosPorUno(Arrays.asList(gaseosa01, gaseosa02));
        Moneda pesos = new Peso();

        gaseosa01.setCosto(100);
        gaseosa02.setCosto(100);

        double renta = combo.getPrecio(1200, pesos);
        double valorEsperado = 1000.0;

        assertEquals(valorEsperado, renta);
    }

    @Test(expected = RuntimeException.class)
    public void testAlIntentarEstablecerElCostoDeUnDosPorUnoEntoncesLanzaError(){
        Gaseosa gaseosa01 = new Gaseosa();
        Gaseosa gaseosa02 = new Gaseosa();
        DosPorUno combo = new DosPorUno(Arrays.asList(gaseosa01, gaseosa02));

        combo.setCosto(200);
    }

    @Test
    public void testElPrecioDeVentaDelProductoEnMonedaVacaEsElCorrecto(){
        ProductoGranja productoVaca = new ProductoGranja();
        Moneda vaca = new Vaca();

        int cantidadMercancia = 1;
        double valorEsperado = 100.0;

        productoVaca.setCosto(vaca);
        gaseosa.setCosto(costoLitro);

        double renta = gaseosa.getPrecio(cantidadMercancia, vaca);

        assertEquals(valorEsperado, renta);
    }
}
