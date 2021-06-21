import Creador.*;
import org.junit.Assert;
import org.junit.Test;

public class EfectosTest {

    @Test
    public void testAgregarCincoAlFinal() {
        String cadena = (new CreadorEfectoAgregarCincoAlFinal()).obtenerValor().aplicarA("algo");
        Assert.assertEquals("algo5", cadena);
    }

    @Test
    public void testAgregarOchoAlFinal() {
        String cadena = (new CreadorEfectoAgregarOchoAlFinal()).obtenerValor().aplicarA("ALGO");
        Assert.assertEquals("ALGO8", cadena);
    }

    @Test
    public void testDarVueltaYPrimeraMayuscula() {
        String cadena = (new CreadorEfectoDarVueltaYPrimeraMayuscula()).obtenerValor().aplicarA("algo");
        Assert.assertEquals("Ogla", cadena);
    }

    @Test
    public void testPrimeraMayuscula() {
        String cadena = (new CreadorEfectoPrimeraMayuscula()).obtenerValor().aplicarA("algo");
        Assert.assertEquals("Algo", cadena);
    }

    @Test
    public void testPrimeraMayusculaYAgregarOcho() {
        String cadena = (new CreadorEfectoPrimeraMayusculaYAgregarOcho()).obtenerValor().aplicarA("algo");
        Assert.assertEquals("Algo8", cadena);
    }

    @Test
    public void testEfectoAgregarCincoAlFinalNoSeAplicaACadenaVacia() {
        try {
            String cadena = (new CreadorEfectoAgregarCincoAlFinal()).obtenerValor().aplicarA("");
            Assert.fail("no se arrojo exception al aplicar en cadena vacia");
        } catch (RuntimeException exception) {
            Assert.assertEquals("no se puede aplicar efecto a cadena vacia", exception.getMessage());
        }
    }

    // Nuevos Tests

    @Test
    public void testEfectoAgregarTresAlFinalYPrimeraMinuscula(){
        String cadena = (new CreadorEfectoAgregarTresYPrimeraMinuscula()).obtenerValor().aplicarA("ALGO");
        Assert.assertEquals("aLGO3", cadena);
    }

    @Test
    public void testEfectoDarVueltaYPrimeraLetraMinusculaYAgregarCuatroAlFinal(){
        String cadena = (new CreadorEfectoDarVueltaYPrimeraLetraMinusculaYAgregarCuatroAlFinal()).obtenerValor().aplicarA("ALGO");
        Assert.assertEquals("oGLA4", cadena);
    }
}
