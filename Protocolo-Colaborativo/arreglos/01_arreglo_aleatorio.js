/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 1.1: Declaración y creación de un arreglo de 10 enteros con valores aleatorios.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    const TAMANO = 10;
    const numeros = new Array(TAMANO);

    // Llenado con valores enteros aleatorios entre 0 y 99
    for (let i = 0; i < TAMANO; i++) {
        numeros[i] = Math.floor(Math.random() * 100);
    }

    console.log("=== Actividad 1: Arreglo de 10 enteros aleatorios (JavaScript) ===");
    console.log("Contenido del arreglo:");
    numeros.forEach((valor, i) => {
        console.log(`Posición [${i}]: ${valor}`);
    });
}

main();
