"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 2.1: Declaración, inicialización y recorridos de una matriz 3x3.
Lenguaje: Python 3
"""

def main():
    # Inicialización estática de matriz 3x3 con números del 1 al 9
    matriz = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    print("=== Actividad 2.1: Matriz 3x3 (Python) ===")
    
    # Recorrido e impresión en forma de tabla
    print("\n1. Recorrido por filas (formato tabla):")
    for fila in matriz:
        print("\t".join(str(val) for val in fila))

    # Recorrido por columnas
    print("\n2. Recorrido por columnas:")
    filas = len(matriz)
    columnas = len(matriz[0])
    for col in range(columnas):
        columna_vals = [str(matriz[fila][col]) for fila in range(filas)]
        print(f"Columna {col}: {', '.join(columna_vals)}")

if __name__ == "__main__":
    main()
