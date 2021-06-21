package Efectos;

import java.util.List;

public abstract class EfectoCompuesto implements Efecto{

    List<Efecto> efectos;

    @Override
    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        agregarEfectos();

        for (Efecto efecto : efectos){
            unaCadena = efecto.aplicarA(unaCadena);
        }

        return (unaCadena);
    }

    protected abstract void agregarEfectos();
}
