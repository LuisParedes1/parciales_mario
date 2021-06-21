package Efectos;

public class EfectoAgregarCuatroAlFinal extends EfectoAgregarAlFinal{

    private String valor = "4";

    @Override
    protected String obtenerValorAConcatenar() {
        return this.valor;
    }
}
