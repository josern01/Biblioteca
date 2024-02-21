/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedahilos;

import java.util.Random;
import java.util.concurrent.*;

public class BusquedaHilos {
    static class BusquedaSecuencialRunnable implements Runnable {
        private int[] arreglo;
        private int elemento;
        private int inicio;
        private int fin;
        private int resultado = -1;

        public BusquedaSecuencialRunnable(int[] arreglo, int elemento, int inicio, int fin) {
            this.arreglo = arreglo;
            this.elemento = elemento;
            this.inicio = inicio;
            this.fin = fin;
        }

        public int getResultado() {
            return resultado;
        }

        @Override
        public void run() {
            for (int i = inicio; i < fin; i++) {
                if (arreglo[i] == elemento) {
                    resultado = i;
                    return;
                }
            }
        }
    }

    public static int busquedaSecuencialConHilos(int[] arreglo, int elemento, int numHilos) {
        ExecutorService executor = Executors.newFixedThreadPool(numHilos);
        int segmento = arreglo.length / numHilos;
        int inicio = 0;
        int fin = segmento;
        Future<Integer>[] resultados = new Future[numHilos];

        for (int i = 0; i < numHilos; i++) {
            resultados[i] = (Future<Integer>) executor.submit(new BusquedaSecuencialRunnable(arreglo, elemento, inicio, fin));
            inicio = fin;
            fin = Math.min(fin + segmento, arreglo.length);
        }

        for (int i = 0; i < numHilos; i++) {
            try {
                int indice = resultados[i].get();
                if (indice != -1) {
                    executor.shutdown();
                    return indice;
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        return -1;
    }

    public static void main(String[] args) {
        // Generar un arreglo de 10,000,000 de elementos con valores aleatorios
        int[] arreglo = new int[10_000_000];
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(10000000); // Valores aleatorios entre 0 y 9,999,999
        }

        int elementoBuscado = arreglo[rand.nextInt(arreglo.length)]; // Seleccionar un elemento aleatorio del arreglo
        int numHilos = 4;
        long startTime = System.currentTimeMillis();
        int indice = busquedaSecuencialConHilos(arreglo, elementoBuscado, numHilos);
        long endTime = System.currentTimeMillis();

        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");
        }
        System.out.println("Tiempo total de búsqueda: " + (endTime - startTime) + " milisegundos");
    }
}