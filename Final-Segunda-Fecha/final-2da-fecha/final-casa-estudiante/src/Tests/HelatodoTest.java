package Tests;

import Clases.Vehiculo.Auto;
import Clases.Exceptions.CargadorVacioException;
import Clases.Carga.Helatodo;
import Clases.Vehiculo.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelatodoTest {

    @Test
    public void testHelatodoSePuedeCargarYDescargarCorrectamenteDeUnAuto(){
        Helatodo helatodo = new Helatodo();
        Auto auto = new Auto();

        auto.cargar(helatodo);

        assertEquals(helatodo, auto.descargar());
    }

    @Test
    public void testAlIntentarDescargarUnHelatodoDeUnAutoVacioEntoncesLanzaCargadorVacioException(){

        Auto auto = new Auto();

        assertThrows(CargadorVacioException.class, () -> {
            auto.descargar();
        });
    }

    @Test
    public void testHelatodoSePuedeCargarYDescargarCorrectamenteDeUnaMoto(){
        Helatodo helatodo = new Helatodo();
        Moto moto = new Moto();

        moto.cargar(helatodo);

        assertEquals(helatodo, moto.descargar());
    }

    @Test
    public void testAlIntentarDescargarUnHelaTodoDeUnaMotoVaciaEntoncesLanzaCargadorVacioException(){

        Moto moto = new Moto();

        assertThrows(CargadorVacioException.class, () -> {
            moto.descargar();
        });
    }
}
