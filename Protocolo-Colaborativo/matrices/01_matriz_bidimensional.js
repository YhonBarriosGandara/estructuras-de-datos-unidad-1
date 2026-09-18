/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 2.1: Declaración, inicialización y recorridos de una matriz 3x3.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    // Inicialización estática de matriz 3x3 con números del 1 al 9
    const matriz = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ];

    console.log("=== Actividad 2.1: Matriz 3x3 (JavaScript) ===");

    // Recorrido e impresión en forma de tabla
    console.log("\n1. Recorrido por filas (formato tabla):");
    for (let i = 0; i < matriz.length; i++) {
        console.log(matriz[i].join("\t"));
    }

    // Recorrido por columnas
    console.log("\n2. Recorrido por columnas:");
    const filas = matriz.length;
    const columnas = matriz[0].length;

    for (let col = 0; col < columnas; col++) {
        const columnaVals = [];
        for (let fila = 0; fila < filas; fila++) {
            columnaVals.push(matriz[fila][col]);
        }
        console.log(`Columna ${col}: ${columnaVals.join(", ")}`);
    }
}

main();
