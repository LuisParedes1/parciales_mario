package nuevoModelo.Clases;

public abstract class Producto {

    public abstract void setCosto(int unCosto);

    protected abstract int getCosto();

    public double getPrecio(int numeroLitros, Moneda moneda){
        return moneda.getPrecio(numeroLitros, getCosto());
    }
}
