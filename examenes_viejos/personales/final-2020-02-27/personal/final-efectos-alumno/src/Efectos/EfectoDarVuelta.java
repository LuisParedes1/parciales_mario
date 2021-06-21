package Efectos;

public class EfectoDarVuelta implements Efecto {
    @Override
    public String aplicarA(String unaCadena) {
        return new StringBuffer(unaCadena).reverse().toString();
    }
}
