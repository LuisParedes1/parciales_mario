package ar.fi.uba.modeloNuevo.Clases.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;

public class LosaRadiante implements Componente{

    private int metros;
    private int precioKw;

    public LosaRadiante(int metros, int precioKw) {
        if (datosInvalidos(metros, precioKw)){
            throw new DatosInvalidos();
        }
        this.metros = metros;
        this.precioKw = precioKw;
    }

    private boolean datosInvalidos(int metros, int precioKw){
        return (metros < 0 || precioKw < 0);
    }

    @Override
    public int getGastoTotal() {
        return precioKw * metros * metros;
    }
}
