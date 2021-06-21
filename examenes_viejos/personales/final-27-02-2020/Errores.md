# Errores del código



## Errores de Pruebas

* Las pruebas estan buenas

  


##  Errores de Clases

### Casa

* La clase `Casa` tiene alto acoplamiento y baja cohesión.
* Viola el principio de unica resposabilidad porque se encarga de guardar los distintos ComponenetesElectricos, Iterarlos y devolver el costoTotal.

### Componente Electrico

* Viola el encapsulamiento al preguntar que tipo de objeto es y luego accionar. Se arregla haciendo uso del polimorfismo.

# Principios de diseño que se rompen

* Principio de Única Responsabilidad: Pues las clase `Casa`esta encargada de iterar, calcular y guardar los distintos componentes.
* Principio Abierto-Cerrado: Las clases están muy rígidas, lo cual causa que estén cerradas a la extensión.
* Principio Inversión de Dependencia: Pues siempre se programa contra clases concretas





---

* Single Responsability Principal
* Open-Close Principal
* Lizcov Substitution Principal
* Interface Segregation Principal
* Dependency Invertion Principal

# Supuestos

Si se pasa 0 m², 0 Kg de madera, o algun dato igual a cero se asume que es valido. Puede ser redundante pero no es error. Los errores se producen cuando se pasan datos negativos



En caso de pasar algun dato invalido se lanzara la excepcion `DatoInvalido()` 