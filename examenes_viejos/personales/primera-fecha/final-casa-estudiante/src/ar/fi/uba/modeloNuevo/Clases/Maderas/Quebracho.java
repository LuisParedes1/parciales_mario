package ar.fi.uba.modeloNuevo.Clases.Maderas;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;

public class Quebracho implements Madera{
    private int kg;
    private final int PUREZA = 2;
    private final int PRECIO_KG = 4;

    public Quebracho(int kg) {
        if(kg<0){
            throw new DatosInvalidos();
        }
        this.kg = kg;
    }

    @Override
    public int getGastoTotal(int metrosCuadrados) {
        return metrosCuadrados * kg * PRECIO_KG * PUREZA;
    }

    @Override
    public int getKg() {
        return this.kg;
    }
}
