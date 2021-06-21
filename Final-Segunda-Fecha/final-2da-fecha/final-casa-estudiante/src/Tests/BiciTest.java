package Tests;

import Clases.Exceptions.CargadorInvalidoException;
import Clases.Exceptions.MotoNoPuedeEquiparPortaBiciException;
import Clases.Portador.CargadorBici;
import Clases.Portador.Portador;
import Clases.Vehiculo.Auto;
import Clases.Carga.Bici;
import Clases.Vehiculo.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BiciTest {

    @Test
    public void testAlIntentarCargarUnaBiciEnUnAutoSinCargadorDeBiciEntoncesLanzaCargadorInvalidoException(){

        Auto auto = new Auto();
        Bici bici = new Bici();

        assertThrows(CargadorInvalidoException.class, () -> {
            auto.cargar(bici);
        });

    }

    @Test
    public void testAlAsignarleUnPortadorBiciAlAutoAhoraSiPuedeCargarLaBici(){

        Auto auto = new Auto();
        Bici bici = new Bici();
        Portador portadorBici = new CargadorBici();

        auto.cambiarPortador(portadorBici);

        auto.cargar(bici);

        assertEquals(bici, auto.descargar());
    }

    @Test
    public void testAlAsignarUnPortadorBiciAUnaMotoEntoncesDevuelveMotoNoPuedeEquiparPortaBiciException(){
        Moto moto = new Moto();
        Portador portadorBici = new CargadorBici();


        assertThrows(MotoNoPuedeEquiparPortaBiciException.class, () -> {
            moto.cambiarPortador(portadorBici);
        });
    }

    @Test
    public void testAlIntentarCargarUnaBiciEnUnaMotoEntoncesDevuelveExcepcion(){
        Moto moto = new Moto();
        Bici bici = new Bici();

        assertThrows(CargadorInvalidoException.class, () -> {
            moto.cargar(bici);
        });
    }


}
