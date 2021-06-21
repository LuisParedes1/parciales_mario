package main.ar.edu.fiuba.algoiii;

public abstract class Partido {

    private final int CANT_MIN_VOTOS = 1;

    public abstract void votar(int votos);

    public void votar(){
        this.votar(CANT_MIN_VOTOS);
    }

    public abstract int obtenerVotos();

    public abstract String obtenerNombre();
}
