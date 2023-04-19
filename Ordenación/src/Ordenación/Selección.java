package Ordenación;

import java.util.Arrays;
import java.util.Random;

public class Selección {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numerosAleatorios = new int[150];
        for (int i = 0; i < 150; i++) {
            numerosAleatorios[i] = rand.nextInt(1000); // genera un número aleatorio entre 0 y 999
        }
        System.out.println("Números aleatorios generados: " + Arrays.toString(numerosAleatorios));
        ordenarSeleccion(numerosAleatorios);
        System.out.println("Números aleatorios ordenados: " + Arrays.toString(numerosAleatorios));
    }

    public static void ordenarSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // intercambiar elemento i con el mínimo encontrado
            int aux = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = aux;
        }
    }

}
