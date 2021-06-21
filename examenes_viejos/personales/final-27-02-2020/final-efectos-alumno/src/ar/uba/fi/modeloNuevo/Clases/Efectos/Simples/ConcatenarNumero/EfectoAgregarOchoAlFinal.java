package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

public class EfectoAgregarOchoAlFinal extends EfectoConcatenarNumero implements Efecto {

    private final int NUMERO_CONCATENAR = 8;

    @Override
    public String aplicarA(String unaCadena) {
       return this.aplicarA(unaCadena, NUMERO_CONCATENAR);
    }
}
