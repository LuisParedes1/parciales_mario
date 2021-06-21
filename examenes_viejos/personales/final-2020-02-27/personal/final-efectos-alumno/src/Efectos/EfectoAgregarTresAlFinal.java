package Efectos;

public class EfectoAgregarTresAlFinal extends EfectoAgregarAlFinal{

    private String valor = "3";
    @Override
    protected String obtenerValorAConcatenar() {
        return this.valor;
    }
}
