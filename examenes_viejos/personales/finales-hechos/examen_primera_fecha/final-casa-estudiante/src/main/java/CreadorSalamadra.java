public class CreadorSalamadra implements Creador {
    @Override
    public ComponenteSalamadra crear() {
        return new Salamadra();
    }
}
