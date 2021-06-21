package nuevoModelo.Clases;

public class Peso extends Moneda{


    @Override
    protected double valorCotizacion(int numeroLitros) {
        return numeroLitros;
    }
}
