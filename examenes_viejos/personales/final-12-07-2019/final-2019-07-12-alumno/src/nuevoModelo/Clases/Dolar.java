package nuevoModelo.Clases;

public class Dolar extends Moneda {

    private final int COTIZACION_DEL_DIA = 50;

    @Override
    protected double valorCotizacion(int numeroLitros) {
        return numeroLitros * COTIZACION_DEL_DIA;
    }
}
