package Tests;
import Clases.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlumnoTest {

    @Test
    public void unAlumnoPagaCuotaCompleta()
    {
        Alumno a = new Alumno();

        assertEquals(100, a.deuda());
    }

    @Test
    public void unAlmnoTieneUnHermanoEntoncesElHermanoPaga75PdeCuota() {
        Alumno ova = new Alumno("ova", new Alumno("gabi", "sabatini"));

        assertEquals(75, ova.deuda());
    }
}
