# Errores de diseño

## Problemas con los Tests

* Los nombres son poco descriptivos y no se entiende a primera vista que es lo que hace
* Los nombres de las variables no describen lo que almacena
* En la clase `combo.setCosto(200);` se lanza una excepcion y no hay un test para comprobar que funcione correctamente.



## Errores de clase

## Gaseosa

* En la clase `Gaseosa` 

```
private double valorCotizacion(int i, Moneda dollars) {
    if ( dollars == Moneda.DOLLARS) {
        return i * 50;
    }

    return i;
}
```

​		Al preguntar por el tipo de clase rompe el encapsulamiento. Se podria mejorar utilizando polimorfismo

* La clase `gaseosa` esta cerrado a la extension, lo cual lo hace rigido y poco flexible
* Hay codigo repetido en valorCotizado(int i, Moneda dollars)

## Cosas buenas

* Se programa contra la interfaz Productos. Respetando el principio de inversion de dependencia

# Principios que se rompen

* Single Responsability

* Open close

  

# Supuestos

* Al asignar el precio se refiere a setPrecio por Litro de gaseosa. 
* Al pedir el precio se supone que piden el precio por x cantidad de litros en una moneda determinada