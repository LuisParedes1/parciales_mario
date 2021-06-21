package Efectos;

public class EfectoAgregarCincoAlFinal extends EfectoAgregarAlFinal {

    private String valor = "5";

    @Override
    protected String obtenerValorAConcatenar() {
        return this.valor;
    }
}
