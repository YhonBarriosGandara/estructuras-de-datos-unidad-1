"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 2.2: Operaciones con matrices: suma de elementos e intercambio de filas.
Lenguaje: Python 3
"""

def main():
    # Inicialización de matriz 3x3 con números del 1 al 9
    matriz = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    print("=== Actividad 2.2: Operaciones sobre Matrices (Python) ===")
    
    print("\nMatriz original:")
    for fila in matriz:
        print("\t".join(str(val) for val in fila))

    # 1. Suma de todos los elementos de la matriz
    suma_total = 0
    for fila in matriz:
        for val in fila:
            suma_total += val

    print(f"\n1. Suma de todos los elementos: {suma_total}")

    # 2. Intercambio de la primera fila (índice 0) con la última fila (índice 2)
    # En Python podemos realizar un intercambio directo (swap de referencias de listas)
    matriz[0], matriz[2] = matriz[2], matriz[0]

    print("\n2. Matriz tras intercambiar fila 0 (primera) con fila 2 (última):")
    for fila in matriz:
        print("\t".join(str(val) for val in fila))

if __name__ == "__main__":
    main()
