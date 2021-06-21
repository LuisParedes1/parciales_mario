public class Losa extends ComponenteElectrico {
    @Override
    public int getConsumo() {
        return getPrecioKw() * getNumeroMetros() * getNumeroMetros();
    }
}
