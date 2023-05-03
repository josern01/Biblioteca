
package Ordenación;


public class Hanoi {
    
        public static void hanoi(int discos, char origen, char auxiliar, char destino) {
        if (discos == 1) {
            System.out.println("Mover disco 1 desde la torre " + origen + " hasta la torre " + destino);
        } else {
            hanoi(discos - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + discos + " desde la torre " + origen + " hasta la torre " + destino);
            hanoi(discos - 1, auxiliar, origen, destino);
        }
    }
    
    public static void main(String[] args) {
        int discos = 3;
        char origen = 'A';
        char auxiliar = 'B';
        char destino = 'C';
        hanoi(discos, origen, auxiliar, destino);
    }
    
    
    
}
