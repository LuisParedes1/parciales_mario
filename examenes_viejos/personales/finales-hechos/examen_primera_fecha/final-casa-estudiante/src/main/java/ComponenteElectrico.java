
public abstract class ComponenteElectrico implements Componente{


    protected int metros;
    protected int precioKw;
    protected int calorias;

    public void setPrecioKw(int precioKw){
        this.precioKw = precioKw;
    }

    public void setmetros(int metros){
        this.metros = metros;
    }

    public int getPrecioKw(){
        return this.precioKw;
    }

    public int getNumeroMetros(){
        return this.metros;
    }

/*
    public ComponenteElectrico(String type){

        if (type == "LOSA_RADIANTE"){

            this.miTIPO = "LOSA_RADIANTE";

        }else if (type == "CeRcO-ElEcTrIcO"){

            this.miTIPO = "CeRcO-ElEcTrIcO";

        }else if (type == "estufa"){

            this.miTIPO = "estufa";

        }else{
            //Por defualt será nada
        }
    }

    public int getConsumo() {

        if (miTIPO == "LOSA_RADIANTE"){

            return precioKw * metros * metros;

        }else if (miTIPO == "CeRcO-ElEcTrIcO"){

            return metros * precioKw;

        }else if (miTIPO == "estufa"){

            return ambientes * precioKw * calorias;

        }else{
            return 0;
        }

    }

 */
}
