package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero;

import ar.uba.fi.modeloNuevo.Clases.CadenaVaciaException;

public class EfectoConcatenarNumero{

    public String aplicarA(String unaCadena, int unNumero) {
        if (unaCadena.equals("")) {
            throw new CadenaVaciaException();
        }

        String nuevoString = unaCadena + unNumero;

        return nuevoString;
    }
}
