public class CreadorCercoElectrico implements Creador {
    @Override
    public ComponenteElectrico crear() {
        return new CercoElectrico();
    }
}
