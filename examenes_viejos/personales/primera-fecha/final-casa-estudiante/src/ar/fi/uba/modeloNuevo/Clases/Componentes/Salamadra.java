package ar.fi.uba.modeloNuevo.Clases.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Componentes.Componente;
import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;
import ar.fi.uba.modeloNuevo.Clases.Excepciones.LimiteMaderaAlcanzado;
import ar.fi.uba.modeloNuevo.Clases.Maderas.Madera;

import java.util.ArrayList;
import java.util.List;

public class Salamadra implements Componente {

    private final int MAX_CAPACIDAD_MADERA = 15;
    private int metrosCuadrados;
    private int sumatoriaKg;
    List<Madera> maderas = new ArrayList<Madera>();

    public Salamadra(int metrosCuadrados) {
        if(datoInvalido(metrosCuadrados)){
            throw new DatosInvalidos();
        }
        this.metrosCuadrados = metrosCuadrados;
        this.sumatoriaKg = 0;
    }

    @Override
    public int getGastoTotal() {
        int total = 0;

        for (Madera madera : maderas){
            total += madera.getGastoTotal(metrosCuadrados);
        }
        return total;
    }

    public void agregarMadera(Madera madera) {
        if(limiteMaderaExcedido(madera)){
            throw new LimiteMaderaAlcanzado();
        }
        maderas.add(madera);
        sumatoriaKg += madera.getKg();
    }

    private boolean datoInvalido(int metrosCuadrados){
        return (metrosCuadrados < 0);
    }

    private boolean limiteMaderaExcedido(Madera madera){
        return (sumatoriaKg + madera.getKg() > MAX_CAPACIDAD_MADERA);
    }
}
