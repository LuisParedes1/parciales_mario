package ar.fi.uba.modeloNuevo.Test;

import ar.fi.uba.modeloNuevo.Clases.Casa;
import ar.fi.uba.modeloNuevo.Clases.Componentes.CercoElectrico;
import ar.fi.uba.modeloNuevo.Clases.Componentes.Estufa;
import ar.fi.uba.modeloNuevo.Clases.Componentes.LosaRadiante;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Pino;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Quebracho;
import ar.fi.uba.modeloNuevo.Clases.Componentes.Salamadra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCasa {

    @Test
    public void test01AlAgregarEstufaCercoElectricoYLosaEntoncesCalculaElPrecioCorrectamente() {

        Casa casa =  new Casa();

        Estufa estufaDelBanio = new Estufa(1, 1000, 10);
        casa.agregarComponente(estufaDelBanio);

        LosaRadiante losaComedor = new LosaRadiante(10, 10);
        casa.agregarComponente(losaComedor);

        CercoElectrico cercoFondo = new CercoElectrico(10, 10);
        casa.agregarComponente(cercoFondo);

        assertEquals(11100, casa.getGastoTotal());
    }

    @Test
    public void test02AlAgregarEstufaCercaElectricoLosaYSalamadraConQuebrachoYPinoEntoncesCalculaElPrecioCorrecto(){

        Casa casa =  new Casa();

        Estufa estufaDelBanio = new Estufa(1, 1000, 10);
        casa.agregarComponente(estufaDelBanio);

        LosaRadiante losaComedor = new LosaRadiante(10, 10);
        casa.agregarComponente(losaComedor);

        CercoElectrico cercoFondo = new CercoElectrico(10, 10);
        casa.agregarComponente(cercoFondo);


        Salamadra salamadra = new Salamadra(1);
        Quebracho quebracho = new Quebracho(1);
        Pino pino = new Pino(3);

        salamadra.agregarMadera(quebracho);
        salamadra.agregarMadera(pino);

        casa.agregarComponente(salamadra);

        assertEquals(11110, casa.getGastoTotal());


    }
}
