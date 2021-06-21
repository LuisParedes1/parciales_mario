# Errores del código



## Errores de Pruebas

* Las pruebas no pasan

* 

  


##  Errores de Clases

### Fabrica de Efectos

* La decisión de crear un método de clase para la creación de nuevas clases es un poco polémica. Aunque es mas fácil de implementar tiene alta rigidez y no permite extender la clase ya que los métodos de clase no son heredados, violando el principio abierto-cerrado.

### Efectos (en general)

* Codigo Repetido
* 

# Principios de diseño que se rompen

* Principio de Única Responsabilidad: 
* Principio Abierto-Cerrado: La fabrica no esta abierta para la extension.
* Principio Inversión de Dependencia: 





---

* Single Responsability Principal
* Open-Close Principal
* Lizcov Substitution Principal
* Interface Segregation Principal
* Dependency Invertion Principal

# Supuestos

Si se pasa 0 m², 0 Kg de madera, o algun dato igual a cero se asume que es valido. Puede ser redundante pero no es error. Los errores se producen cuando se pasan datos negativos



En caso de pasar algun dato invalido se lanzara la excepcion `DatoInvalido()` 