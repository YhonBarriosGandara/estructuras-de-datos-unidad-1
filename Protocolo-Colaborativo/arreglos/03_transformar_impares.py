"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 1.3: Modificación de arreglo - transformar números impares a cero.
Lenguaje: Python 3
"""

def main():
    valores = [4, 7, 10, 13, 16, 21, 24, 31, 40, 45]

    print("=== Actividad 3: Transformar Impares a Cero (Python) ===")
    print(f"Arreglo original: {valores}")

    # Modificación in-place evaluando paridad con operador residuo (%)
    for i in range(len(valores)):
        if valores[i] % 2 != 0:
            valores[i] = 0

    print(f"Arreglo transformado: {valores}")

if __name__ == "__main__":
    main()
