package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

public class EfectoAgregarCincoAlFinal extends EfectoConcatenarNumero implements Efecto {

    private final int NUMERO_CONCATENAR = 5;

    @Override
    public String aplicarA(String unaCadena) {
        return this.aplicarA(unaCadena, NUMERO_CONCATENAR);
    }
}
