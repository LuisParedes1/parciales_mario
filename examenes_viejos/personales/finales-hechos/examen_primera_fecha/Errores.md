# Errores de diseño

## Problemas con CasaTest

* Nombre poco descriptivo. No se entiende qué hace la prueba.

* Los tests hechos a la casa no son unitarios. Esto causa que no se pueda detectar en qué parte del codigo se producen errores en caso de fallar la prueba.

* No hay suficientes pruebas que prueben la funcionalidad completa. Hay muchos casos sin probar.

* Se rompe el encapsulamiento al acceder a las variables de instancia de la estufa.

  ​    

## Problemas con ComponenteElectrico

* Rompe el encapsulamiento al preguntar que tipo de dato es.
* No hace uso del polimorfismo.
* Codigo fragil.
* No esta abierto para la extension.

## Bad Smells

* Pregunta el tipo de dato que pertenece y actua de acuerdo a ello.
*  Muchos if, else if, else if...



## Problemas con Casa

* Repeticion de codigo
* Alto acoplamiento y baja cohesion

---

# Principios que se rompen



1. Single Responsabily: Casa y ComponenteElectrico tienen mas de una unica responsabilidad cada uno
   	* Casa: Se encarga de recorrer las estufas, cercos, & losas y de almacenarlas.
   	* ComponenteElectrico: Se encarga de crear la componente y de calcular su valor.

2. OpenClose: En todo momento se programa contra clases concretas y no contra interfaces u clases abstractas. El codigo esta cerrado para la extension.

3. Inversion de dependencias: Se esta programando contra la clases concretas y no contra interfaces 
   u clases abstractas