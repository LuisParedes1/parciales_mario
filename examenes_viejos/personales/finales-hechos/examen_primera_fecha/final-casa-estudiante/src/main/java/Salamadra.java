import java.util.ArrayList;
import java.util.List;

public class Salamadra extends ComponenteSalamadra {

    private int MAX_KG = 15;

    private List<TipoMadera> componentesMadera = new ArrayList<TipoMadera>();
    private int kgAcumulados = 0;

    @Override
    public int getConsumo() {

        int total = 0;

        for (TipoMadera componente: componentesMadera){
            total += componente.getConsumo();
        }
        return total;
    }

    @Override
    public void agregarMadera(TipoMadera tipoMadera) {
        tipoMadera.validarMadera(kgAcumulados, MAX_KG);
        this.componentesMadera.add(tipoMadera);
        this.kgAcumulados += tipoMadera.getNumKg();
    }
}