EJERCICIO 1: Análisis de ciclos anidados con condición
Determiná la familia de complejidad temporal del siguiente método en el peor caso. Justificá analizando el comportamiento de los índices.
public static int buscarYValidar(int[] array) {
    for(int i = 0; i < array.length; i++) {       //N1
        if(array[i] == 5) {                       //C1       
            return i;                             //C2
        } else {
            for(int j = 0; j < i; j++) {          //N2
                if(array[j] == 6) return i;       //C3  
            }
        }
    }
    return -1;                                    //C4
}                                               //N1.N2 =  O(n^2) 

EJERCICIO 2: Comparativa de "Fierros" (TDAs Estáticos)
Analizá la operación Acolar(x) en:
1.ColaPU (Estática): El nuevo elemento va siempre a la posición 0.       //N1 = O(n)
2.ColaPI (Estática): El nuevo elemento va al final del arreglo.          //C1 = O(1)
3.ColaLD (Dinámica): Usa nodos con punteros al primero y último.         //C2 = O(1)
Indica el costo temporal para cada una y justifica por qué la implementación estática "PU" es distinta a las demás.
//PU es distinta porque el despazamiento va a depender de la cantidad de elementos,mientras que en los otros es constante porque agrega sin importar la cantidad de elementos.

EJERCICIO 3: El algoritmo integrador filtrar
Un método recibe una Cola de n elementos, extrae todos para identificar los mayores a un "límite" (guardándolos en una cola nueva) y luego restaura la original 
volcando los datos desde una estructura auxiliar tmp. Determina: (a) Complejidad temporal O(n) y (b) Complejidad espacial O(n).
//Complejidad temporal O(n) + O(n) = 2 O(n) = O(n). 
// Complejidad espacial O(n) + O(n) + O(n) = 3 O(n) = O(n).

EJERCICIO 4: Regla de la Suma (Código Secuencial)
Analizá el siguiente método y determiná su familia de complejidad desglosando el costo de cada bloque independiente.
public static void procesoMisterioso(int[] arreglo) {
    int n = arreglo.length;                                                    //C1 = O(1)
    System.out.println("Inicio");                                              //C2 = O(1)
    for (int i = 0; i < n; i++) { arreglo[i] *= 2; }                           //N1 = O(n)
    for (int j = 0; j < n; j++) { System.out.println(arreglo[j]); }            //N2 = O(n)
}                                                                   //O(1) + O(1) + O(n) + O(n) = O(n)

EJERCICIO 5: Regla del Producto (Matrices)
Analizá la complejidad de recorrer una matriz cuadrada n X n para buscar un número par. Identificá el peor caso.
//O(n^2) porque en el peor caso, el número par podría estar en la última posición de la matriz, lo que requeriría recorrer todos los elementos antes de encontrarlo.

EJERCICIO 6: Jerarquía de Dominancia
Determiná la familia de complejidad total del siguiente bloque de código aplicando las reglas de simplificación.
public static void procesoMezclado(int[] datos) {
    int n = datos.length;
    // Bloque A: Bucle simple
    for (int i = 0; i < n; i++)                                          //N1 = O(n)
        { System.out.println(datos[i]); }                                //C1 = O(1)
    // Bloque B: Bucles anidados
    for (int i = 0; i < n; i++) {                                        //N2= O(n)
        for (int j = 0; j < n; j++) { datos[i] += datos[j]; }            //N3 = O(n)
    }
}                                                                //O(n) + O(n^2) = O(n^2)

EJERCICIO 7: Divide y Vencerás 
Explicá matemáticamente por qué la Búsqueda Binaria sobre un arreglo ordenado de n elementos pertenece a la familia O(log n). Utilizá el concepto de divisiones 
sucesivas de la tanda de datos.
//En la busqueda binaria descartas la mitad de los elementos en cada paso, lo que es mucho mas eficiente que recorrerla toda. En cantidad de operaciones, necesita menos iteraciones.
//La justificación matemática se basa en que cada iteración reduce el espacio de búsqueda a la mitad, lo que es igual al logaritmo base 2 de n, es decir, O(log n). 
// Esto es porque el número de veces que se puede dividir n por 2 antes de llegar a 1 es log2(n).

EJERCICIO 8: El costo oculto del TDA Conjunto
Se desea calcular la intersección de dos Conjuntos (A y B) de tamaño n cada uno usando implementaciones estáticas. El algoritmo recorre A y por cada elemento 
llama a B.Pertenece(x). Si es true, lo agrega a un conjunto resultado usando Agregar(x). ¿Cuál es la complejidad temporal real considerando las validaciones internas del TDA?.
//la complejidad temporal real es O(n^2) porque por cada elemento de A, se realiza una búsqueda en B que tiene un costo O(n) en el peor caso, 
// y luego se agrega al resultado con un costo O(1). Por lo tanto, el costo total es O(n) * O(n) = O(n^2). Se multiplican porque los ciclos estan anidados.

EJERCICIO 9: Parámetros múltiples (Cola con Prioridad)
Analizá la operación Desacolar() en una Cola con Prioridad implementada con K subcolas. Justificá por qué su complejidad es O(K) y por qué se dice que es 
independiente de la cantidad total de elementos n.
//C1+C2=C4
//C3+C4*K=tiempo
//Costo=O(k)

EJERCICIO 10: Análisis de algoritmo con recursión doble
Dada la implementación recursiva de Fibonacci:
public static int fibonacci(int n) {
    if (n <= 1) return n;                               
    return fibonacci(n - 1) + fibonacci(n - 2);         
} 
Sin realizar el cálculo matemático exacto, indicá a qué familia de costo (jerarquía) pertenece (¿Constante, Lineal o Exponencial?) y justificá basándote en el 
crecimiento de las llamadas.
 //O(2^n) porque cada llamada a fibonacci(n) crece exponencialmente porque se llama a si misma n veces. Como base tiene 2 llamadas (2 términos), y a medida que va recibiendo mas llamadas,crece exponencialmente.
