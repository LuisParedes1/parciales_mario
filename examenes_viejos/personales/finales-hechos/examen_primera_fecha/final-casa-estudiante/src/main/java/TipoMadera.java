public abstract class TipoMadera {

    protected int metros;
    protected int numKg;

    public abstract int getConsumo();


    public void setMetros(int metros) {
        this.metros = metros;
    }

    public void setKg(int kg){
        this.numKg = kg;
    }
    public int getNumKg(){
        return this.numKg;
    }

    public abstract void setCoheficiente(int coheficiente);

    public void validarMadera(int KgAcumulados, int maxKg){
        if ((KgAcumulados + this.getNumKg()) > maxKg){
            this.setKg(maxKg - KgAcumulados);
        }
    }
}