package main.ar.edu.fiuba.algoiii;

public class PartidoTordos extends Partido {

    private int votos;
    private String nombre;

    public PartidoTordos(){
        this.votos = 0;
        this.nombre = "Tordos";
    }

    @Override
    public void votar(int votos) {
        this.votos += votos;
    }

    @Override
    public int obtenerVotos() {
        return this.votos;
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }
}
