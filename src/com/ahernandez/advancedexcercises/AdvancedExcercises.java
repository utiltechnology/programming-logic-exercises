package com.ahernandez.advancedexcercises;

public class AdvancedExcercises {

// Tiempo mínimo para completar todas las tareas con paralelismo.

// Dado un conjunto de tareas, cada una con una duración y una lista
// de dependencias (tareas que deben completarse antes), y asumiendo
// que se dispone de trabajadores ilimitados (se puede ejecutar cualquier
// número de tareas en paralelo), calcula el tiempo mínimo necesario para
// completar todas las tareas.

// Cada tarea se identifica por un número entero de 0 a n-1. Las
// dependencias forman un grafo acíclico dirigido (DAG).
// Si hay un ciclo, retorna -1.

// Parametros
// durations: array de enteros donde durations[i] es la duración de la tarea i.

// dependencies: array bidimensional de pares [a, b] donde la tarea a debe completarse
// antes de que pueda comenzar la tarea b.

// El tiempo mínimo (entero) para completar todas las tareas, o -1 si existe un ciclo.


//    Ejemplos
// 3 tareas: 0→1→2, duraciones [3, 2, 1]
// Camino crítico: tarea 0 (t=3) → tarea 1 (t=5) → tarea 2 (t=6)
//    minTaskTime(new int[]{3, 2, 1}, new int[][]{{0, 1}, {1, 2}}) //

    // Tareas independientes corren en paralelo → la más larga tarda 4
    // minTaskTime(new int[]{4, 3, 2}, new int[][]{}) // 4

    // Ciclo detectado → -1
    // minTaskTime(new int[]{1, 1}, new int[][]{{0, 1}, {1, 0}}) // -1

//    Restricciones

//    1 ≤ n ≤ 1000
//    0 ≤ durations[i] ≤ 10^4
//    0 ≤ dependencies.length ≤ 5000

    // No hay auto-dependencias (a ≠ b en cada par)

    public int minTaskTime(int[] durations, int[][] dependencies) {
        // Escribe tu solución aquí
        return 0;
    }


}
