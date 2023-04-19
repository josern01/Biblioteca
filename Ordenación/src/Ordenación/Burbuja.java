package Ordenación;

import java.util.Arrays;
import java.util.Random;

public class Burbuja {

    public static void main(String[] args) {
           Random rand = new Random();
        int[] numerosAleatorios = new int[150];
        for (int i = 0; i < 150; i++) {
            numerosAleatorios[i] = rand.nextInt(1000); 
        }
        System.out.println("Números aleatorios generados: " + Arrays.toString(numerosAleatorios));
        ordenarBurbuja(numerosAleatorios);
        System.out.println("Números aleatorios ordenados: " + Arrays.toString(numerosAleatorios));
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    // intercambiar elementos
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
       
    }
}
