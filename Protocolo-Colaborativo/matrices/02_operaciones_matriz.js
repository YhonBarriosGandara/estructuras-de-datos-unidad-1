/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 2.2: Operaciones con matrices: suma de elementos e intercambio de filas.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    // Inicialización de matriz 3x3 con números del 1 al 9
    const matriz = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ];

    console.log("=== Actividad 2.2: Operaciones sobre Matrices (JavaScript) ===");

    console.log("\nMatriz original:");
    for (let i = 0; i < matriz.length; i++) {
        console.log(matriz[i].join("\t"));
    }

    // 1. Suma de todos los elementos de la matriz
    let sumaTotal = 0;
    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {
            sumaTotal += matriz[i][j];
        }
    }

    console.log(`\n1. Suma de todos los elementos: ${sumaTotal}`);

    // 2. Intercambio de la primera fila (índice 0) con la última fila (índice 2)
    // En JavaScript moderno podemos usar asignación por desestructuración de referencias
    [matriz[0], matriz[2]] = [matriz[2], matriz[0]];

    console.log("\n2. Matriz tras intercambiar fila 0 (primera) con fila 2 (última):");
    for (let i = 0; i < matriz.length; i++) {
        console.log(matriz[i].join("\t"));
    }
}

main();
