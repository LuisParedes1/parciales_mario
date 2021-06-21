package test.ar.edu.fiuba.algoiii;

import main.ar.edu.fiuba.algoiii.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FoolMaticTest {

    @Test
    public void testContabilizarVotosDeVotantePoR() throws PartidoInvalido {
        CamaraPartidos camara = new CamaraPartidos();
        Partido pOr = (new CreadorPartidos()).creadorPartido("PoR");

        camara.agregarPartido(pOr);
        camara.votar(pOr);

        int votosParaPoR = 1;

        assertEquals(votosParaPoR, camara.escrutinio(pOr));
    }

    @Test
    public void testContabilizarVotosDeVotanteTordos() throws PartidoInvalido {
        CamaraPartidos camara = new CamaraPartidos();
        int votosParaPoR = 0;
        int votosParaTordos = 1;


        Partido tordos = (new CreadorPartidos()).creadorPartido("Tordos");
        Partido pOr = (new CreadorPartidos()).creadorPartido("PoR");

        camara.agregarPartido(pOr);
        camara.agregarPartido(tordos);

        camara.votar(tordos);


        assertEquals(votosParaTordos, camara.escrutinio(tordos));
        assertEquals(votosParaPoR, camara.escrutinio(pOr));
    }

    @Test
    public void testDistribuyendoVotosParaEmparejarEleccion() throws PartidoInvalido {
        CamaraPartidos camara = new CamaraPartidos();

        Partido tordos = (new CreadorPartidos()).creadorPartido("Tordos");
        Partido pOr = (new CreadorPartidos()).creadorPartido("PoR");

        camara.agregarPartido(pOr);
        camara.agregarPartido(tordos);

        camara.votar(tordos, 1000);
        camara.votar(pOr, 5);


        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, camara.escrutinio(tordos));
        assertEquals(votosParaPoR, camara.escrutinio(pOr));
    }

    @Test
    public void testSeAgregaUnNuevoPartidoAlSistemaDeVotos(){
        CamaraPartidos camara = new CamaraPartidos();

        Partido tordos = (new CreadorPartidos()).creadorPartido("Tordos");
        Partido pOr = (new CreadorPartidos()).creadorPartido("PoR");

        camara.agregarPartido(pOr);
        camara.agregarPartido(tordos);

        camara.votar(tordos, 1000);
        camara.votar(pOr, 5);


        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, camara.escrutinio(tordos));
        assertEquals(votosParaPoR, camara.escrutinio(pOr));


    }
}
