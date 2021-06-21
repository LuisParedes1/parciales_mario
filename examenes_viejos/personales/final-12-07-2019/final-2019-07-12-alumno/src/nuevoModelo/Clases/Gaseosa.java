package nuevoModelo.Clases;

public class Gaseosa extends Producto {

    private int costo;

    public void setCosto(int unCosto) {
        this.costo = unCosto;
    }

    @Override
    protected int getCosto() {
        return costo;
    }


}
