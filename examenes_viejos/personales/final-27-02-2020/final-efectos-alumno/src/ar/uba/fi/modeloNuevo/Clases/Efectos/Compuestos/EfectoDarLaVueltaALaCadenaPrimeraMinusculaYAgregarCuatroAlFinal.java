package ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos;

import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.ConcatenarNumero.EfectoAgregarCuatroAlFinal;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoDarVueltas;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoPrimeraMinuscula;

public class EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal extends EfectoCompuesto implements Efecto {

    public EfectoDarLaVueltaALaCadenaPrimeraMinusculaYAgregarCuatroAlFinal (){
        efectos.add(new EfectoDarVueltas());
        efectos.add(new EfectoPrimeraMinuscula());
        efectos.add(new EfectoAgregarCuatroAlFinal());
    }
}
