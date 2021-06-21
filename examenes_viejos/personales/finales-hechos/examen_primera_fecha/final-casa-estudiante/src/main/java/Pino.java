public class Pino extends TipoMadera {

    private int coheficienteCalorico;

    @Override
    public int getConsumo() {
        return (this.metros * this.metros* this.numKg)/ this.coheficienteCalorico;
    }

    @Override
    public void setCoheficiente(int coheficiente) {
        this.coheficienteCalorico = coheficiente;
    }

}
