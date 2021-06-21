public class CreadorLosa implements Creador {
    @Override
    public ComponenteElectrico crear() {
        return new Losa();
    }
}
