package Tests;

import Clases.Carga.Bici;
import Clases.Exceptions.CargadorInvalidoException;
import Clases.Exceptions.MotoNoPuedeEquiparPortaBiciException;
import Clases.Portador.CargadorBici;
import Clases.Portador.Portador;
import Clases.Vehiculo.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MotoTests {

    @Test
    public void testAlCargarseUnPortaBiciAUnaMotoEntoncesLanzaExcepcion() {
        Moto moto = new Moto();
        Portador cargadorBici = new CargadorBici();

        assertThrows(MotoNoPuedeEquiparPortaBiciException.class, () -> {
            moto.cambiarPortador(cargadorBici);
        });
    }

    @Test
    public void testAlCargarleAUnaMotoUnaBiciEntoncesLanzaExcepcion(){

        Moto moto = new Moto();
        Bici bici = new Bici();

        assertThrows(CargadorInvalidoException.class, () -> {
            moto.cargar(bici);
        });
    }

}
