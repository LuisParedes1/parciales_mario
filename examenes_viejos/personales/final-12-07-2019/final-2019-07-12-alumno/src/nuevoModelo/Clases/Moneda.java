package nuevoModelo.Clases;

public abstract class Moneda {
    public double getPrecio(int numeroLitros, int costo){
        return ( valorCotizacion(numeroLitros) - costo) ;
    }

    protected abstract double valorCotizacion(int numeroLitros);
}
