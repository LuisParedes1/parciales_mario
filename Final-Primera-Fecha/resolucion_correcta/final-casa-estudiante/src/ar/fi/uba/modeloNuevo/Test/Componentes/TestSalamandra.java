package ar.fi.uba.modeloNuevo.Test.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Componentes.Salamadra;
import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Excepciones.LimiteMaderaAlcanzado;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Pino;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Quebracho;
import org.junit.Assert;
import org.junit.Test;

public class TestSalamandra {

    @Test
    public void test01AlCrearUnaSalamadraDe1MetroCuadradoConQuebracho1KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 1;
        int metrosCuadrados = 1;
        int precioEsperado = 8;

        Quebracho quebracho = new Quebracho(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(quebracho);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test
    public void test02AlCrearUnaSalamadraDe10MetroCuadradoConQuebracho1KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 1;
        int metrosCuadrados = 10;
        int precioEsperado = 80;

        Quebracho quebracho = new Quebracho(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(quebracho);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test
    public void test03AlCrearUnaSalamadraDe1MetroCuadradoConQuebracho10KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 10;
        int metrosCuadrados = 1;
        int precioEsperado = 80;

        Quebracho quebracho = new Quebracho(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(quebracho);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test
    public void test04AlCrearUnaSalamadraDe1MetroCuadradoConPino1KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 1;
        int metrosCuadrados = 1;
        int precioEsperado = 2/3;

        Pino pino = new Pino(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(pino);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test
    public void test05AlCrearUnaSalamadraDe10MetroCuadradoConPino1KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 1;
        int metrosCuadrados = 10;
        int precioEsperado = (10*1*2)/3; // (metrosCuadrados * kg * PRECIO_KG) / COEFICIENTE_CALORICO;

        Pino pino = new Pino(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(pino);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test
    public void test06AlCrearUnaSalamadraDe1MetroCuadradoConPino10KgEntoncesCalculaElPrecioCorrecto() {

        int kg = 10;
        int metrosCuadrados = 1;
        int precioEsperado = (10*1*2)/3;;

        Pino pino = new Pino(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(pino);

        Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
    }

    @Test(expected = DatosInvalidos.class)
    public void test07AlCrearUnaSalamandraConMetrosInvalidosEntoncesLanzaDatoInvalidoExcepcion(){
        int metrosCuadrados = -1;

        Salamadra salamadra = new Salamadra(metrosCuadrados);
    }

    @Test(expected = LimiteMaderaAlcanzado.class)
    public void test08AlAgregarMasDe15KgDeQuebrachoALaSalamadraEntoncesLanzaError(){
        int kg = 16;
        int metrosCuadrados = 1;

        Quebracho quebracho = new Quebracho(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(quebracho);
    }

    @Test(expected = LimiteMaderaAlcanzado.class)
    public void test09AlAgregarMasDe15KgDePinoALaSalamadraEntoncesLanzaError(){
        int kg = 16;
        int metrosCuadrados = 1;

        Pino pino = new Pino(kg);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(pino);
    }

    @Test(expected = LimiteMaderaAlcanzado.class)
    public void test10AlAgregar10KgDePinoYLuego6KgDeQuebrachoALaSalamadraEntoncesLanzaError(){
        int kgPino = 10;
        int kgQuebracho = 6;
        int metrosCuadrados = 1;

        Pino pino = new Pino(kgPino);
        Quebracho quebracho = new Quebracho(kgQuebracho);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(pino);
        salamadra.agregarMadera(quebracho);

    }

    @Test(expected = LimiteMaderaAlcanzado.class)
    public void test11AlAgregar6KgDeQuebrachoYLuego10KgDePinoALaSalamadraEntoncesLanzaError(){
        int kgPino = 10;
        int kgQuebracho = 6;
        int metrosCuadrados = 1;

        Pino pino = new Pino(kgPino);
        Quebracho quebracho = new Quebracho(kgQuebracho);
        Salamadra salamadra = new Salamadra(metrosCuadrados);

        salamadra.agregarMadera(quebracho);
        salamadra.agregarMadera(pino);
    }

   @Test
   public void test12AlCrearUnaSalamadraSinMaderaEntoncesDevuelveElValorCorrecto(){

       int precioEsperado = 0;
       int metrosCuadrados = 1;


       Salamadra salamadra = new Salamadra(metrosCuadrados);

       Assert.assertEquals(precioEsperado, salamadra.getGastoTotal());
   }

}