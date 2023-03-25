package potencia;

import java.util.Scanner;



public class Potencia {

    public static void main(String[] args) {

        int base;
        int exponente;
        Scanner leer =  new Scanner(System.in);
        System.out.println("ingresa la base:");
        base = leer.nextInt();
        System.out.println("ingresa el exponente:");
        exponente = leer.nextInt();
        System.out.println("El resultado es:");
        int resultado = potencia(base, exponente);
        System.out.println(resultado);

    }

    public static int potencia(int base, int exponente) {
        if(exponente == 0){
            return 1;
            
        }else {
            return base * potencia(base,exponente-1);
        }

    }
}
