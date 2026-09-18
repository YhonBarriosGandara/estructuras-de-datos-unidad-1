"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 1.4: Modificación de arreglo - multiplicar cada elemento por su índice posicional.
Lenguaje: Python 3
"""

def main():
    valores = [2, 4, 6, 8, 10]

    print("=== Actividad 4: Multiplicar por Índice (Python) ===")
    print(f"Valores originales: {valores}")

    # Cada celda se multiplica por la posición que ocupa en memoria
    for i in range(len(valores)):
        valores[i] = valores[i] * i

    print("\nValores multiplicados por su índice:")
    for i, valor in enumerate(valores):
        print(f"Índice {i} -> Valor resultante: {valor}")

if __name__ == "__main__":
    main()
