package Clases.Carga;

import Clases.Exceptions.CargadorInvalidoException;
import Clases.Portador.CargadorBici;
import Clases.Portador.CargadorHelatodo;

public class
Bici implements Carga{

    @Override
    public void cargarEn(CargadorBici cargadorBici) {
        cargadorBici.cargar(this);
    }

    @Override
    public void cargarEn(CargadorHelatodo cargadorHelatodo) {
        throw new CargadorInvalidoException();
    }
}
