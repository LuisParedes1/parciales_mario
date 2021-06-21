# Errores del código



## Errores de Pruebas

* Nombre poco descriptivo. `test` no indica que hace la prueba.

* No hay pruebas unitarias.

* En las pruebas se accede a los datos de las clases, violando el encapsulamiento.

  

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



### Principios

* Single Responsability Principal
* Open close Principal
* Lizcob Principal
* Interface segregation Principal
* Dependency Invertion Principal

# Supuestos

