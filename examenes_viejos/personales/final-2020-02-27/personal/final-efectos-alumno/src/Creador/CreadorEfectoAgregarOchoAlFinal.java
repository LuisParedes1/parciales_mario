package Creador;
import Efectos.*;

public class CreadorEfectoAgregarOchoAlFinal extends CreadorEfecto{

    @Override
    protected Efecto crearEfecto() {
        return new EfectoAgregarOchoAlFinal();
    }
}
