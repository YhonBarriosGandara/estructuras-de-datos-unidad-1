"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 1.2: Recorrido e impresión mediante bucle clásico y for-each.
Lenguaje: Python 3
"""

def main():
    valores = [15, 28, 33, 42, 59]

    print("=== Actividad 2: Recorridos de Arreglo (Python) ===")
    
    # 1. Recorrido con bucle for clásico (indexado por rango)
    print("\n1. Recorrido clásico indexado (for i in range):")
    for i in range(len(valores)):
        print(f"Índice {i} -> Valor: {valores[i]}")

    # 2. Recorrido con for-each (iteración directa sobre elementos)
    print("\n2. Recorrido for-each (for elemento in valores):")
    for elemento in valores:
        print(f"Elemento: {elemento}")

if __name__ == "__main__":
    main()
