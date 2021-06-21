package Efectos;

public class EfectoAgregarOchoAlFinal extends EfectoAgregarAlFinal {

    private String valor = "8";

    @Override
    protected String obtenerValorAConcatenar() {
        return this.valor;
    }
}
