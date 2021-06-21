package ar.fi.uba.modeloNuevo.Clases.Componentes;

import ar.fi.uba.modeloNuevo.Clases.Excepciones.DatosInvalidos;

public class Estufa implements Componente{

    private int ambientes;
    private int calorias;
    private int precioKw;

    public Estufa(int ambientes, int calorias, int precioKw) {
        if (datosInvalidos(ambientes,calorias,precioKw)){
            throw new DatosInvalidos();
        }
        this.ambientes = ambientes;
        this.calorias = calorias;
        this.precioKw = precioKw;
    }

    private boolean datosInvalidos(int ambientes, int calorias, int precioKw){
        return (ambientes < 0 || calorias < 0 || precioKw < 0);
    }
    @Override
    public int getGastoTotal() {
        return ambientes * precioKw * calorias;
    }



}
