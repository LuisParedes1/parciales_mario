public class Quebracho extends TipoMadera {

    private int pureza;

    @Override
    public int getConsumo() {
        return this.metros * this.metros * this.numKg * this.pureza;
    }


    @Override
    public void setCoheficiente(int pureza) {
        this.pureza = pureza;
    }

}
