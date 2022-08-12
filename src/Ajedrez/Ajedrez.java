
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
        boolean turno = true;
        
        Piezas[][] tablero = new Piezas[8][8];
        tablero[0][3] = new Dama('q', 3, 0, false);
        tablero[0][4] = new Rey('k', 4, 0, false);
        tablero[0][2] = new Arfil('b', 2, 0, false);
        tablero[0][5] = new Arfil('b', 5, 0, false);
        tablero[0][1] = new Caballo('n', 1, 0, false);
        tablero[0][6] = new Caballo('n', 6, 0, false);
        tablero[0][0] = new Torre('r', 0, 0, false);
        tablero[0][7] = new Torre('r', 7, 0, false);
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon('p', i, 1, false);
        }
        tablero[7][3] = new Dama('q', 3, 7, true);
        tablero[7][4] = new Rey('k', 4, 7, true);
        tablero[7][2] = new Arfil('b', 2, 7, true);
        tablero[7][5] = new Arfil('b', 5, 7, true);
        tablero[7][1] = new Caballo('n', 1, 7, true);
        tablero[7][6] = new Caballo('n', 6, 7, true);
        tablero[7][0] = new Torre('r', 0, 7, true);
        tablero[7][7] = new Torre('r', 7, 7, true);
        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Peon('p', i, 6, false);
        }
        while(salida == true){
            
            if(turno = true){
                
                
                turno = false;
            }else{
                
                
                turno = true;
            }
        }
    }
    
    
}
