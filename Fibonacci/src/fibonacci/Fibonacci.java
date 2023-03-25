package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numerodeterminos;
        System.out.println("ingresa el numero de terminos para la serie de fibonacci");
        numerodeterminos = leer.nextInt();

        for (int i = 0; i < numerodeterminos; i++) {
            System.out.print(fibonacci(i) +  " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}
