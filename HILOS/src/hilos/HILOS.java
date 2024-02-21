
package hilos;


public class HILOS {
    
    static final int TAMANO_ARREGLO = 100;
    static final int NUMERO_HILOS = 5;
    static final int ELEMENTO_BUSCADO = 42;
    static int[] arreglo = new int[TAMANO_ARREGLO];

    
    public static void main(String[] args) {
        
        for (int i = 0; i < TAMANO_ARREGLO; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        
// Crear hilos para la búsqueda secuencial
        Thread[] hilos = new Thread[NUMERO_HILOS];
        int elementosPorHilo = TAMANO_ARREGLO / NUMERO_HILOS;

        for (int i = 0; i < NUMERO_HILOS; i++) {
            int inicio = i * elementosPorHilo;
            int fin = (i == NUMERO_HILOS - 1) ? TAMANO_ARREGLO : (i + 1) * elementosPorHilo;

            hilos[i] = new Thread(new BusquedaHilo(inicio, fin));
            hilos[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Elemento " + ELEMENTO_BUSCADO + " encontrado en posición: " + BusquedaHilo.posicionEncontrada);
    }

    static class BusquedaHilo implements Runnable {
        int inicio;
        int fin;
        static int posicionEncontrada = -1;

        public BusquedaHilo(int inicio, int fin) {
            this.inicio = inicio;
            this.fin = fin;
        }

        public void run() {
            for (int i = inicio; i < fin; i++) {
                if (arreglo[i] == ELEMENTO_BUSCADO) {
                    posicionEncontrada = i;
                    break;
                }
            }
        }
    }
}
    
    

