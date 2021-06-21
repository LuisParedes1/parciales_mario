package ar.fi.uba.modeloNuevo.Clases.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;

public class CercoElectrico implements Componente{

    private int precioKw;
    private int metros;

    public CercoElectrico(int metros, int precioKw) {
        if(datosInvalidos(metros,precioKw)){
            throw new DatosInvalidos();
        }
        this.metros = metros;
        this.precioKw = precioKw;
    }

    private boolean datosInvalidos(int metros, int precioKw){
        return (metros < 0 || precioKw < 10);
    }

    @Override
    public int getGastoTotal() {
        return metros * precioKw;
    }
}
