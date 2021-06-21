# Errores del código



## Errores de Pruebas

* Nombre poco descriptivo. `test` no indica que hace la prueba.
* No hay pruebas unitarias. Como consecuencia no se puede detectar claramente en que parte de la prueba se produce el error en caso de fallar la prueba.
* Viola el encapsulamiento al pedir `auto.cargar(Cargas.HELATODO);`. Esto trae como consecuencia hace rígido al código. 



##  Errores de Clases

## Auto

* En el método `cargar(Cargas carga)`

  ```java
  public void cargar(Cargas carga) {
  
      if (carga == Cargas.BICI) {
          throw new RuntimeException();
      }
      this.cargas.add(carga);
  }
  ```

  Se debe reemplazar preguntar si es una bici por polimorfismo. Esto rompe el encapsulamiento pues depende de que tipo de dato esta operando para actuar.

* Se repite código en la clase `auto` y `moto`. Se puede refactorizar con una clase abstracta o clase concreta en comun de la cual hereden.

# Principios de diseño que se rompen

* Principio Inversión de Dependencia: Pues siempre se programa contra clases concretas y no contra interfaces o clases abstractas





# Nota de Implementacion



Al hacer refactor tome la decision de implementacion de usar el patron visitor para asignar la correcta Carga en el Cargador correspondiente.

Esta decision de implementacion se tomo debido a la distintas jerarquias de familias entre los portadores de carga y las cargas. Sabiendo que tiene como limitacion que al agregar un nuevo producto hay que cambiar tambien el cargador.



Se tomo esta decision ya que asumi que el cargadorBici solamente carga Bicis y asi para cualquier otro cargador