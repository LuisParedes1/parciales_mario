public class CercoElectrico extends ComponenteElectrico {
    @Override
    public int getConsumo() {
        return getNumeroMetros() * getPrecioKw();
    }
}
