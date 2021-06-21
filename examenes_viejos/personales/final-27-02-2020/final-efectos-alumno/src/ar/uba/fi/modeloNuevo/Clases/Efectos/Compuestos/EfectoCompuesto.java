package ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos;

import ar.uba.fi.modeloNuevo.Clases.CadenaVaciaException;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;

import java.util.ArrayList;
import java.util.List;

public class EfectoCompuesto {

    protected List<Efecto> efectos = new ArrayList<Efecto>();

    public String aplicarA(String unaCadena) {
        if(unaCadena.isEmpty()){
            throw new CadenaVaciaException();
        }

        String cadenaFinal = unaCadena;

        for(Efecto efecto : efectos){
            cadenaFinal = efecto.aplicarA(cadenaFinal);
        }

        return cadenaFinal;
    }
}
