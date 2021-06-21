import java.util.ArrayList;
import java.util.List;

public class Casa {

    public List<Componente> componentes = new ArrayList<Componente>();

    public int getGastoTotal() {

        int gasto = 0;

        for (Componente componente: componentes){
            gasto += componente.getConsumo();
        }

        return gasto;
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }
}

