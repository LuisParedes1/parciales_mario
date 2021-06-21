package ar.fi.uba.modeloNuevo.Clases.Maderas;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;

public class Pino implements Madera{
    private final int kg;
    private final int COEFICIENTE_CALORICO = 3;
    private final int PRECIO_KG = 2;

    public Pino(int kg) {
        if(kg < 0){
            throw new DatosInvalidos();
        }
        this.kg = kg;
    }

    @Override
    public int getGastoTotal(int metrosCuadrados) {
        return (metrosCuadrados * kg * PRECIO_KG) / COEFICIENTE_CALORICO;
    }

    @Override
    public int getKg() {
        return this.kg;
    }
}
