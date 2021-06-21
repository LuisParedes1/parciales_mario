package ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarTresAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoPrimeraMinuscula;

public class EfectoAgregarTresAlFinalYPrimeraMinuscula extends EfectoCompuesto implements Efecto {

    public EfectoAgregarTresAlFinalYPrimeraMinuscula(){
        efectos.add(new EfectoAgregarTresAlFinal());
        efectos.add(new EfectoPrimeraMinuscula());
    }
}
