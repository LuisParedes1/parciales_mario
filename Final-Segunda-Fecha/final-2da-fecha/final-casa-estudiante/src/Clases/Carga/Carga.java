package Clases.Carga;

import Clases.Portador.CargadorBici;
import Clases.Portador.CargadorHelatodo;

public interface Carga {

    void cargarEn(CargadorBici cargadorBici);

    void cargarEn(CargadorHelatodo cargadorHelatodo);
}
