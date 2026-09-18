/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 1.5: Búsqueda lineal secuencial en un arreglo.
 * Lenguaje: JavaScript (Node.js)
 */

function buscarLineal(arreglo, objetivo) {
    /**
     * Recorre secuencialmente el arreglo comparando cada celda con el valor buscado.
     * Retorna el índice de la primera coincidencia o -1 si no existe.
     * Complejidad temporal: O(n).
     */
    for (let i = 0; i < arreglo.length; i++) {
        if (arreglo[i] === objetivo) {
            return i;
        }
    }
    return -1;
}

function main() {
    const valores = [14, 25, 39, 42, 58, 63, 77, 81, 95];

    console.log("=== Actividad 5: Búsqueda Lineal (JavaScript) ===");
    console.log("Arreglo disponible: [ " + valores.join(", ") + " ]");

    // Tomar objetivo por argumento de consola o usar valor por defecto (42) para ejecución directa
    const argumento = process.argv[2];
    const objetivo = argumento !== undefined ? parseInt(argumento, 10) : 42;

    const posicion = buscarLineal(valores, objetivo);

    if (posicion !== -1) {
        console.log(`Resultado: El valor ${objetivo} fue encontrado en el índice [${posicion}].`);
    } else {
        console.log(`Resultado: El valor ${objetivo} no se encuentra en el arreglo.`);
    }
}

main();
