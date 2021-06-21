package ar.uba.fi.modeloNuevo.Clases.Efectos.Simples;

import ar.uba.fi.modeloNuevo.Clases.CadenaVaciaException;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

public class EfectoPrimeraMinuscula implements Efecto {
    @Override
    public String aplicarA(String unaCadena) {
        if(unaCadena.isEmpty()){
            throw new CadenaVaciaException();
        }
        return unaCadena.substring(0,1).toLowerCase() + unaCadena.substring(1);
    }
}
