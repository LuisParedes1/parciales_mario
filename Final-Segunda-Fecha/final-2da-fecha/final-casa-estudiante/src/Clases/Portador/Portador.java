package Clases.Portador;

import Clases.Carga.Carga;
import Clases.Exceptions.CargadorVacioException;

import java.util.Stack;

public abstract class Portador {

    protected Stack<Carga> portador = new Stack();

    public abstract void cargar(Carga carga);


    public Carga descargar(){
        if(portador.isEmpty()){
            throw new CargadorVacioException();
        }

            return portador.pop();
        }
}

