package ar.fi.uba.modeloNuevo.Clases;

import ar.fi.uba.modeloNuevo.Clases.Componentes.Componente;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    List<Componente> componentes = new ArrayList<Componente>();
    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public int getGastoTotal() {
        int total = 0;
        for (Componente componente: componentes){
            total += componente.getGastoTotal();
        }
        return total;
    }
}
