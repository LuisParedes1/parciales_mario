package ar.uba.fi.modeloNuevo.Clases.Efectos.Compuestos;


import ar.uba.fi.modeloNuevo.Clases.Efectos.Efecto;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoDarVueltas;
import ar.uba.fi.modeloNuevo.Clases.Efectos.Simples.EfectoPrimeroMayuscula;

public class EfectoDarVueltasYPrimeraMayuscula extends EfectoCompuesto implements Efecto {

    public EfectoDarVueltasYPrimeraMayuscula(){
        efectos.add(new EfectoDarVueltas());
        efectos.add(new EfectoPrimeroMayuscula());
    }
}
