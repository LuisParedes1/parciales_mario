package main.ar.edu.fiuba.algoiii;

public class CreadorPartidos {



    public Partido creadorPartido(String partido) throws PartidoInvalido {

        switch (partido) {
            case "pOr":
            case "PoR":
            case "POR":
            case "PxR":
                    return new PartidoPoR();

            case "Tordos":
                return new PartidoTordos();

            default:
                throw new PartidoInvalido();
        }
    }
}
