"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 1.1: Declaración y creación de un arreglo de 10 enteros con valores aleatorios.
Lenguaje: Python 3
"""
import random

def main():
    # Declaración de tamaño fijo requerido
    TAMANO = 10
    
    # Creación y llenado del arreglo (lista en Python) con enteros aleatorios de 0 a 99
    numeros = [random.randint(0, 99) for _ in range(TAMANO)]
    
    print("=== Actividad 1: Arreglo de 10 enteros aleatorios (Python) ===")
    print("Contenido del arreglo:")
    for i, valor in enumerate(numeros):
        print(f"Posición [{i}]: {valor}")

if __name__ == "__main__":
    main()
