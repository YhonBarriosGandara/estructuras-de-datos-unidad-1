/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 1.3: Modificación de arreglo - transformar números impares a cero.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    const valores = [4, 7, 10, 13, 16, 21, 24, 31, 40, 45];

    console.log("=== Actividad 3: Transformar Impares a Cero (JavaScript) ===");
    console.log("Arreglo original: [ " + valores.join(", ") + " ]");

    // Modificación in-place evaluando paridad con operador residuo (%)
    for (let i = 0; i < valores.length; i++) {
        if (valores[i] % 2 !== 0) {
            valores[i] = 0;
        }
    }

    console.log("Arreglo transformado: [ " + valores.join(", ") + " ]");
}

main();
