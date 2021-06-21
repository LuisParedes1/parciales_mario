package main.ar.edu.fiuba.algoiii;

import javax.crypto.NullCipher;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class CamaraPartidos {

    private final int MINIMA_CANT_VOTOS = 1;
    Dictionary partidos = new Hashtable();


    public void votar(Partido partido, int votos){
       aplicarAyuda();
        partido.votar(votos);
    }
    public void votar(Partido partido) {
        this.votar(partido, MINIMA_CANT_VOTOS);
    }

    public void agregarPartido(Partido partido) {
        this.partidos.put(partido.obtenerNombre(), partido);
    }

    public int escrutinio(Partido partido) {
        return partido.obtenerVotos();
    }

    private void aplicarAyuda(){

        Partido PoR = (Partido) partidos.get("PoR");
        Partido tordos = (Partido) partidos.get("Tordos");

        if(PoR != null && tordos != null) {

            if(tordos.obtenerVotos() > PoR.obtenerVotos()*10)
                PoR.votar(10);
        }

    }
}
