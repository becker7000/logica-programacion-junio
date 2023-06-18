## Algoritmos:

Los algoritmos puede tener 3 tipos de instrucciones:

1. **Entrada/Salida:** para solicitar datos o mostrarlos.
2. **Proceso/Cálculo:** hacer operaciones con los datos, procesar la información, aplicar formulas, descomponer datos.
3. **Control:** controlan el flujo de ejecución del código.

> Estructuras de control:

Son estructuras que pueden manupular el flujo de ejecución de una sentencia simple o compuesta. Existen 2 tipos:

1. Por selección: if, switch, ternario.
2. Por repetición: while, for, do-while, foreach.


## Operadores lógicos.

**Operador not(!):** es un operador *unario* y es *prefijo*. Su lógica es invertir el valor, por ejemplo, de verdadero a falso y viceversa.

> Tabla de verdad: 
```
    x   !x
    V    F
    F    V
```

**Operador and(&&):** es un operador *binario* y es *infijo*. Su lógica es que devuelve un verdadero si y solo si ambas expresiones son verdaderas, falso en otro caso.

> Tabla de verdad:

```
    x   y    x&&y
    V   V     V
    V   F     F
    F   V     F
    F   F     F
```

**Operador or(||):** es operador *binario* y es *infijo*. Su lógica es que devuelve verdadero si por lo menos alguna de sus dos expresiones es verdadera, falso en cualquier otro caso.

> Tabla de verdad:
```
    x   y    x||y
    V   V     V
    V   F     V
    F   V     V
    F   F     F
```

## Iteradores:

Los iteradores son estructuras que pueden repetir bloques de código dada una condición, existen 2 tipos de iteradores:

1. Determinados: for
2. Indeterminados: while y do-while

**Nota:** Todos los ciclos naturalmente cuentan con 3 elementos:

1. Variable de control.
2. Condición.
3. Incremento.

