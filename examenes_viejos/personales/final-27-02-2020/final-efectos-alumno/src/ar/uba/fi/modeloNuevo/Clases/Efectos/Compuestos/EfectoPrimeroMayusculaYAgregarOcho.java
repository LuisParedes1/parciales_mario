package ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarOchoAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoPrimeroMayuscula;

public class EfectoPrimeroMayusculaYAgregarOcho extends EfectoCompuesto implements Efecto {

    public EfectoPrimeroMayusculaYAgregarOcho(){
        efectos.add(new EfectoPrimeroMayuscula());
        efectos.add(new EfectoAgregarOchoAlFinal());
    }
}
