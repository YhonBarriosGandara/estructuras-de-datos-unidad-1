/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 1.4: Modificación de arreglo - multiplicar cada elemento por su índice posicional.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    const valores = [2, 4, 6, 8, 10];

    console.log("=== Actividad 4: Multiplicar por Índice (JavaScript) ===");
    console.log("Valores originales: [ " + valores.join(", ") + " ]");

    // Cada celda se multiplica por la posición que ocupa en memoria
    for (let i = 0; i < valores.length; i++) {
        valores[i] = valores[i] * i;
    }

    console.log("\nValores multiplicados por su índice:");
    valores.forEach((valor, i) => {
        console.log(`Índice ${i} -> Valor resultante: ${valor}`);
    });
}

main();
