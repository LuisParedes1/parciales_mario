package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

public class EfectoAgregarCuatroAlFinal extends EfectoConcatenarNumero implements Efecto {

    private final int NUMERO_CONCATENAR = 4;

    @Override
    public String aplicarA(String cadena) {
        return this.aplicarA(cadena, NUMERO_CONCATENAR);
    }
}
