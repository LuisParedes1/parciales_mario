public class Estufa extends ComponenteEstufa {

    @Override
    public int getConsumo() {
        return  getNumeroAmbientes() * getprecioKw() * getNumeroCalorias();
    }
}
