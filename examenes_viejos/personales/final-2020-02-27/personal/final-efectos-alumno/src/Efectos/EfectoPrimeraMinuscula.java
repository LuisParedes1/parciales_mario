package Efectos;

public class EfectoPrimeraMinuscula implements Efecto{
    @Override
    public String aplicarA(String unaCadena) {
        if (unaCadena.equals("")) {
            throw new RuntimeException("no se puede aplicar efecto a cadena vacia");
        }

        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }
}
