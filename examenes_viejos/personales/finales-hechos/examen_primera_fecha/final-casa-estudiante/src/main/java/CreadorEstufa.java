
public class CreadorEstufa implements Creador {
    @Override
    public ComponenteEstufa crear() {
        return new Estufa();
    }
}
