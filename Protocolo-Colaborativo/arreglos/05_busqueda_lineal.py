"""
Protocolo Colaborativo - Unidad 1: Estructuras de Datos
Actividad 1.5: Búsqueda lineal secuencial en un arreglo.
Lenguaje: Python 3
"""
import sys

def buscar_lineal(arreglo, objetivo):
    """
    Recorre secuencialmente el arreglo comparando cada elemento con el valor buscado.
    Retorna el índice de la primera coincidencia o -1 si no existe.
    Complejidad temporal: O(n).
    """
    for i in range(len(arreglo)):
        if arreglo[i] == objetivo:
            return i
    return -1

def main():
    valores = [14, 25, 39, 42, 58, 63, 77, 81, 95]
    print("=== Actividad 5: Búsqueda Lineal (Python) ===")
    print(f"Arreglo disponible: {valores}")

    # Determinar objetivo (por argumento o por input interactivo)
    if len(sys.argv) > 1:
        objetivo = int(sys.argv[1])
    else:
        try:
            entrada = input("Ingrese el valor que desea buscar: ").strip()
            objetivo = int(entrada) if entrada else 42
        except (EOFError, ValueError):
            objetivo = 42
            print(f"(Uso automático por defecto: {objetivo})")

    posicion = buscar_lineal(valores, objetivo)

    if posicion != -1:
        print(f"Resultado: El valor {objetivo} fue encontrado en el índice [{posicion}].")
    else:
        print(f"Resultado: El valor {objetivo} no se encuentra en el arreglo.")

if __name__ == "__main__":
    main()
