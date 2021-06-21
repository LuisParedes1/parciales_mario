# Errores de Diseño

## Errores en las pruebas

* Los nombres de las variables en las pruebas son poco descriptivos de lo que contienen.

* La prueba `testDistribuyendoVotosParaEmparejarEleccion` tiene un nombre poco descriptivo 
con respecto a lo que realmente hace la prueba.

# Errores de FoolMatic

* Rompe el encapsulamiento al preguntar que tipo de dato es para luego acciona
* En el metodo `votar(String leyendaPartido, int numeroVotos)`
    ```
        if ( esLaDiferenciaTordosDiezVecesMayoraPoR(votosPartidoTordos, votosPartidoPoR)) {
                votosPartidoPoR += 10;
            }
    ```
    no respeta el uso de constantes en vez de literales. Es imposible saber que representa ese numero.

# Principios que se violan  

* Inversion de dependencia: Pues se programa contra la clase FoolMatic y no contra una interfaz.

* Principio de Unica Responsabilidad: Pues la clase FoolMatic tiene mas de una unica razon de cambio.

* Open Close Principal: No se puede extender funcionamiento por ser tan rigido el codigo.