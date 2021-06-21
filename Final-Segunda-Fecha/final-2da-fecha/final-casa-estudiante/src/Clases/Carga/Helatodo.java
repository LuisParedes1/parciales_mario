package Clases.Carga;

import Clases.Exceptions.CargadorInvalidoException;
import Clases.Portador.CargadorBici;
import Clases.Portador.CargadorHelatodo;

public class Helatodo implements Carga{

    @Override
    public void cargarEn(CargadorBici cargadorBici) {
        throw new CargadorInvalidoException();
    }

    @Override
    public void cargarEn(CargadorHelatodo cargadorHelatodo) {
        cargadorHelatodo.cargar(this);
    }
}
