public abstract class ComponenteEstufa implements Componente {

    protected int precioKw;
    protected int calorias;
    protected int ambientes;

    public void setNumeroAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public void setPrecioKw(int precioKw) {
        this.precioKw = precioKw;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getNumeroAmbientes() {
        return this.ambientes;
    }

    public int getprecioKw() {
        return this.precioKw;
    }

    public int getNumeroCalorias() {
        return this.calorias;
    }
}
