package Ordenación;

import java.util.Scanner;

public class Ordenacion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("1.-Metodo burbuja");
        System.out.println("2.-Metodo seleccion");
        System.out.println("3.-Metodo insercion directa");
        System.out.println("4.-Metodo QuickSort");
        System.out.println("5.-Metodo Shell");
        System.out.println("6.-Ackerman");
        System.out.println("7.-Hanoi");

        System.out.println("Que metodo desea");

        int opc = leer.nextInt();

        System.out.println("Que tamaño desea la lista a ordenar");

        int n = leer.nextInt();

        switch (opc) {

            case 1:
                int[] arreglo = LLENAR.llenar(n);

                Burbuja.ordenarBurbuja(arreglo);

                break;

            case 2:
                int[] arreglo2 = LLENAR.llenar(n);

                Selección.ordenarSeleccion(arreglo2);

                break;

            case 3:

                int[] arreglo3 = LLENAR.llenar(n);

                Inserción_directa.ordenarInsercionIndirecta(arreglo3);

                break;

            case 4:

                int[] arreglo4 = LLENAR.llenar(n);

                QuickSort.quicksort(arreglo4, 0, n - 1);

                break;

            case 5:
                int[] arreglo5 = LLENAR.llenar(n);
                Shell.ordenarShell(arreglo5);

                break;

            case 6:
                System.out.println("Ingrese el valor de m para Ackermann");
                int m = leer.nextInt();

                System.out.println("Ingrese el valor de n para Ackermann");
                int nAckermann = leer.nextInt();

                int resultado = Ackerman.ackermann(m, nAckermann);
                System.out.println("El resultado de Ackermann para m=" + m + " y n=" + nAckermann + " es: " + resultado);

                break;

            

        }

    }

}
