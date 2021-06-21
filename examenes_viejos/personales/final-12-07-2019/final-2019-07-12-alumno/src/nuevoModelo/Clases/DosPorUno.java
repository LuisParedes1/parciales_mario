package nuevoModelo.Clases;

import java.util.List;

public class DosPorUno extends Producto{

    List<Producto> productos;

    public DosPorUno(List<Producto> productos){
        this.productos = productos;
    }

    @Override
    public void setCosto(int unCosto) {
        throw new RuntimeException("No se puede asignar el costo de un conjunto");
    }

    @Override
    protected int getCosto() {
        int total = 0;

        for (Producto producto : productos){
            total += producto.getCosto();
        }

        return total;
    }

}
