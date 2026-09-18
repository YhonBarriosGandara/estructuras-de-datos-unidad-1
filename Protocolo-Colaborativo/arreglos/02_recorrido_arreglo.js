/**
 * Protocolo Colaborativo - Unidad 1: Estructuras de Datos
 * Actividad 1.2: Recorrido e impresión mediante bucle clásico y for-each.
 * Lenguaje: JavaScript (Node.js)
 */

function main() {
    const valores = [15, 28, 33, 42, 59];

    console.log("=== Actividad 2: Recorridos de Arreglo (JavaScript) ===");

    // 1. Recorrido con bucle for clásico (indexado tradicional)
    console.log("\n1. Recorrido clásico indexado (for i = 0):");
    for (let i = 0; i < valores.length; i++) {
        console.log(`Índice ${i} -> Valor: ${valores[i]}`);
    }

    // 2. Recorrido con for-each (iteración directa con for...of)
    console.log("\n2. Recorrido for-each (for...of):");
    for (const elemento of valores) {
        console.log(`Elemento: ${elemento}`);
    }
}

main();
