package nuevoModelo.Clases;

public class ProductoGranja extends Producto {

    private Vaca costo;
    @Override
    public void setCosto(int unCosto) {
        this.costo = unCosto;
    }

    @Override
    protected int getCosto() {
        return 0;
    }
}
