package Clases.Portador;

import Clases.Carga.Bici;
import Clases.Carga.Carga;

public class CargadorBici extends Portador {
    @Override
    public void cargar(Carga carga) {
        carga.cargarEn(this);
    }

    public void cargar(Bici bici){
        this.portador.add(bici);
    }

}
