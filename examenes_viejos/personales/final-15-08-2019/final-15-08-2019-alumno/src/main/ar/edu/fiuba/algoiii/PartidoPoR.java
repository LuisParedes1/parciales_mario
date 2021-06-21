package main.ar.edu.fiuba.algoiii;

public class PartidoPoR extends Partido {

    private int votos;
    private String nombre;

    public PartidoPoR(){
        this.nombre = "PoR";
        this.votos = 0;
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
