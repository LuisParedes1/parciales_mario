import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasaTest {

    @Test
    public void test01AlCrearUnaEstufaSeLeAsignaLosValoresCorrectos() {
        ComponenteEstufa estufaDelBanio = (new CreadorEstufa()).crear();

        estufaDelBanio.setNumeroAmbientes(1);
        estufaDelBanio.setPrecioKw(10);
        estufaDelBanio.setCalorias(1000);

        assertEquals(1, estufaDelBanio.getNumeroAmbientes());
        assertEquals(10, estufaDelBanio.getprecioKw());
        assertEquals(1000, estufaDelBanio.getNumeroCalorias());

    }

    @Test
    public void test02AlCrearUnaEstufaCalculaElConsumoCorrecto() {
        ComponenteEstufa estufaDelBanio = (new CreadorEstufa()).crear();

        estufaDelBanio.setNumeroAmbientes(1);
        estufaDelBanio.setPrecioKw(10);
        estufaDelBanio.setCalorias(1000);
        int valorEsperado = 10 * 1000;

        assertEquals(valorEsperado, estufaDelBanio.getConsumo());

    }

    @Test
    public void test03AlCrearUnaLosaSeLeAsignaLosValoresCorrectos() {
        ComponenteElectrico losaComedor = (new CreadorLosa()).crear();

        losaComedor.setPrecioKw(10);
        losaComedor.setmetros(10);

        assertEquals(10, losaComedor.getPrecioKw());
        assertEquals(10, losaComedor.getNumeroMetros());
    }

    @Test
    public void test04AlCrearUnaLosaCalculaElConsumoCorrecto() {
        ComponenteElectrico losaComedor = (new CreadorLosa()).crear();

        losaComedor.setPrecioKw(10);
        losaComedor.setmetros(10);
        int valorEsperado = 10 * 10 * 10;

        assertEquals(valorEsperado, losaComedor.getConsumo());
    }

    @Test
    public void test05AlCrearUnCercoElectricoLosValoresCorrectos() {
        ComponenteElectrico cercoElectrico = (new CreadorCercoElectrico()).crear();

        cercoElectrico.setPrecioKw(10);
        cercoElectrico.setmetros(10);

        assertEquals(10, cercoElectrico.getPrecioKw());
        assertEquals(10, cercoElectrico.getNumeroMetros());
    }

    @Test
    public void test06AlCrearUnCercoElectricoElConsumoCorrecto() {
        ComponenteElectrico cercoElectrico = (new CreadorCercoElectrico()).crear();

        cercoElectrico.setPrecioKw(10);
        cercoElectrico.setmetros(10);
        int valorEsperado = 10 * 10;

        assertEquals(valorEsperado, cercoElectrico.getConsumo());
    }

    @Test
    public void test07AlCrearLaCasaElGastoTotalEsCero(){
        Casa casa =  new Casa();
        int valorEsperado = 0;

        assertEquals(valorEsperado, casa.getGastoTotal());
    }

    @Test
    public void test08AlCrearLaCasaYAgregarleComponentesEntoncesCalculaCorrectamenteElGastoTotal(){
        Casa casa =  new Casa();
        int valorEsperado = 11100;

        ComponenteEstufa estufaDelBanio = (new CreadorEstufa()).crear();

        estufaDelBanio.setNumeroAmbientes(1);
        estufaDelBanio.setPrecioKw(10);
        estufaDelBanio.setCalorias(1000);

        casa.agregarComponente(estufaDelBanio);


        ComponenteElectrico losaComedor = (new CreadorLosa()).crear();
        losaComedor.setPrecioKw(10);
        losaComedor.setmetros(10);

        casa.agregarComponente(losaComedor);

        ComponenteElectrico cercoElectrico = (new CreadorCercoElectrico()).crear();
        cercoElectrico.setPrecioKw(10);
        cercoElectrico.setmetros(10);

        casa.agregarComponente(cercoElectrico);


        assertEquals(valorEsperado, casa.getGastoTotal());
    }

    @Test
    public void test09AlCrearUnaMaderaQuebrachoEntoncesCalculaElPrecioCorrectamente(){
        TipoMadera maderaQuebracho = new Quebracho();
        int valorEsperado = 2;

        maderaQuebracho.setMetros(1);
        maderaQuebracho.setKg(1);
        maderaQuebracho.setCoheficiente(2);


        assertEquals(valorEsperado, maderaQuebracho.getConsumo());

    }

    @Test
    public void test10AlCrearUnaMaderaPinoEntoncesCalculaElPrecioCorrectamente(){
        TipoMadera maderaPino = new Pino();
        int valorEsperado = 1;

        maderaPino.setMetros(1);
        maderaPino.setKg(3);
        maderaPino.setCoheficiente(3);

        assertEquals(valorEsperado, maderaPino.getConsumo());
    }

    @Test
    public void test11AlCrearUnaSalamadraDeMaderaQuebrachoEntoncesSusValoresSonLosCorrectos(){
        ComponenteSalamadra salamadra = (new CreadorSalamadra()).crear();

        TipoMadera maderaQuebracho = new Quebracho();
        int valorEsperado = 2;

        maderaQuebracho.setMetros(1);
        maderaQuebracho.setKg(1);
        maderaQuebracho.setCoheficiente(2);

        salamadra.agregarMadera(maderaQuebracho);

        assertEquals(valorEsperado, salamadra.getConsumo());
    }

    @Test
    public void test12AlCrearUnaSalamadraDeMaderaPinoEntoncesSusValoresSonLosCorrectos(){
        ComponenteSalamadra salamadra = (new CreadorSalamadra()).crear();

        TipoMadera maderaPino = new Pino();
        int valorEsperado = 1;

        maderaPino.setMetros(1);
        maderaPino.setKg(3);
        maderaPino.setCoheficiente(3);

        salamadra.agregarMadera(maderaPino);

        assertEquals(valorEsperado, salamadra.getConsumo());
    }

    @Test
    public void test13AlCrearUnaSalamadraYAgregarMasDe15KilosDeMaderaEntoncesNoAceptaMas(){
        ComponenteSalamadra salamadra = (new CreadorSalamadra()).crear();

        TipoMadera maderaPino = new Pino();
        int valorEsperado = 5;

        maderaPino.setMetros(1);
        maderaPino.setKg(16);
        maderaPino.setCoheficiente(3);

        salamadra.agregarMadera(maderaPino);

        assertEquals(valorEsperado, salamadra.getConsumo());
    }

    @Test
    public void test14AlCrearUnaSalamadraYAgregarMitadDePinoYMitadDeQuebrachoEntoncesCalculaElResultadoCorrecto(){

        ComponenteSalamadra salamadra = (new CreadorSalamadra()).crear();
        int valorEsperado = ((1 * 7 ) / 3) +  (1 * 8 * 2);

        TipoMadera maderaPino = new Pino();
        maderaPino.setMetros(1);
        maderaPino.setKg(7);
        maderaPino.setCoheficiente(3);

        TipoMadera maderaQuebracho = new Quebracho();
        maderaQuebracho.setMetros(1);
        maderaQuebracho.setKg(8);
        maderaQuebracho.setCoheficiente(2);


        salamadra.agregarMadera(maderaPino);
        salamadra.agregarMadera(maderaQuebracho);

        assertEquals(valorEsperado, salamadra.getConsumo());
    }

    @Test
    public void test15AlCrearUnaSalamadraYAgregar7kKgDePinoY10KgDeQuebrachoEntoncesCalculaElResultadoCorrecto(){

        ComponenteSalamadra salamadra = (new CreadorSalamadra()).crear();
        int valorEsperado = ((1 * 7 ) / 3) +  (1 * 8 * 2);

        TipoMadera maderaPino = new Pino();
        maderaPino.setMetros(1);
        maderaPino.setKg(7);
        maderaPino.setCoheficiente(3);

        TipoMadera maderaQuebracho = new Quebracho();
        maderaQuebracho.setMetros(1);
        maderaQuebracho.setKg(10);
        maderaQuebracho.setCoheficiente(2);


        salamadra.agregarMadera(maderaPino);
        salamadra.agregarMadera(maderaQuebracho);

        assertEquals(valorEsperado, salamadra.getConsumo());
    }
}
