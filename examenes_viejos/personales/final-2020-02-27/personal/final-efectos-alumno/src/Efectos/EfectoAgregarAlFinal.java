package Efectos;

public abstract class EfectoAgregarAlFinal implements Efecto{

    @Override
    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        String nuevoString = unaCadena + obtenerValorAConcatenar();

        return nuevoString;
    }

    protected abstract String obtenerValorAConcatenar();
}
