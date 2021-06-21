package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples;

import ar.uba.fi.modeloNuevo.Clases.CadenaVaciaException;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

public class EfectoPrimeroMayuscula implements Efecto {
    @Override
    public String aplicarA(String unaCadena) {
        if(unaCadena.isEmpty()){
            throw new CadenaVaciaException();
        }
        return unaCadena.substring(0,1).toUpperCase() + unaCadena.substring(1);
    }
}
