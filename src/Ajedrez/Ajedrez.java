
package Ajedrez;
import java.util.Scanner;

public class Ajedrez {
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        System.out.println("Jugador #1: ");
        String jugador1 = lea.next();
        System.out.println("Jugador #2: ");
        String jugador2 = lea.next();
        boolean salida = true;
        while(salida == true){
            salida = false;
        }
    }
    
    public static void imprimir(String[][] tablero){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.println(tablero[i][j]);
            }
            System.out.println();
        }
    }
}
