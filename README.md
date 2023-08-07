**NOTA:** JDK para el Desarrollo todas las librerías y clases para desarrollar y escribir aplicaciones en Java.

**NOTA:**El JRE es el renting para ejecutar nuestras aplicaciones en Java. Es la máquina virtual de Java.

# Variables

Al ser Java un Lenguaje de programación fuertemente tipado, cualquier variable que definamos en la aplicación debe estar asociada a algún tipo de dato, ya sea a un __primitivo__ representando un solo valor o tambien podria ocupar el tipo de un objeto o tipo de una clase.

## ¿Qué son?

Son una de las partes más importantes del lenguaje de programación, nos ayuda a representar la logica de negocio. Son las entidades que contienen nuestros valores o datos a travez de la aplicación. La declaración de las variables esta formado por dos aspectos o partes importantes el tipo de dato y el nombre que le pondremos a esta variable.

```Java
  (Tipo de dato) (Nombre de la Variable)
      int             unNumero;
  
```
Importante aclarar que despues de la versión 10 se librero un tipado dinamico permitiendo definir o declarar una variable con la palabra reservada __(var)__.

```Java
  var unNumero;
```

El tipo de las variables determina, los valores en si que esta puede contener y las operaciones que podemos realizar con estas variables.


## Catergorias de los tipos de datos

Existen dos categorías de datos pricipales en Java.

__Primitivos__: Los primitivos contienen un sólo valor y en ellos encontramos los tipos enteros (int), los punto flotante (float), los caracteres (char), condiones booleanas (boolean), etc..

__referencia__: Como tipo de dato referencia tenemos los arreglos, las clases y las interfaces.


```Java
int numero;
int unNumero = 10; //Primitivo
Integer unNumero = 19; // Referencia
String nombre = "Andres"; // Referencia
Usuario usuario = new Usuario("Andres"); // Referencia
```

## Conveciones a seguir para definir nombres de variables

*. Por convencion los nombres de las variables empiezan en minusculas.
*. Deben ser un juego de caracteres comprendidos en la codificiacion Unicode
*. No puede ser el mismo valor del nombre de una palabra clave del lenguaje o el nombre de una valor booleano (true, false)
*. No deben tener el mismo nombre de otras variables las cuales esten declaradas en el mismo ámbito
*. Si una variable esta compuesta por más de una palabra como 'unNumero', las palabras se colocan juntas y cada palabra despues de la primera empezara con mayusculas
*. Pueden comenzar con una letra, un simbolo (-), o un simbolo ($), siendo los siguientes caracteres o dígitos.


# ¿Que son los primitivos?



