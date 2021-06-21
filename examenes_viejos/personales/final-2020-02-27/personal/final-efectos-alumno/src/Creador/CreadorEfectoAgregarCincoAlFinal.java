package Creador;
import Efectos.*;

public class CreadorEfectoAgregarCincoAlFinal extends CreadorEfecto {
    @Override
    public Efecto crearEfecto() {
        return (new EfectoAgregarCincoAlFinal());
    }
}
