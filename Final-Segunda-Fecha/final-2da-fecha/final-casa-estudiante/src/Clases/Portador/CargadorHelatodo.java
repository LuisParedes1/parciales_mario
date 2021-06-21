package Clases.Portador;

import Clases.Carga.Carga;
import Clases.Carga.Helatodo;

public class CargadorHelatodo extends Portador {

    @Override
    public void cargar(Carga carga) {
        carga.cargarEn(this);
    }

    public void cargar(Helatodo helatodo){
        this.portador.add(helatodo);
    }


}
