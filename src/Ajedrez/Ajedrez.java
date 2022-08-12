
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
        tablero[7][3] = new Dama('Q', 3, 7, true);
        tablero[7][4] = new Rey('K', 4, 7, true);
        tablero[7][2] = new Arfil('B', 2, 7, true);
        tablero[7][5] = new Arfil('B', 5, 7, true);
        tablero[7][1] = new Caballo('N', 1, 7, true);
        tablero[7][6] = new Caballo('N', 6, 7, true);
        tablero[7][0] = new Torre('R', 0, 7, true);
        tablero[7][7] = new Torre('R', 7, 7, true);
        for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Peon('P', i, 6, false);
        }
        while(salida == true){
            
            if(turno = true){
                System.out.print(jugador1+" ingrese el movimiento a realizar: ");
                String mov = lea.next();
                String num1 = "";
                String num2 = "";
                
                char p1 = mov.charAt(0);
                
                char letra1 = mov.charAt(2);
                char num_1 = mov.charAt(3);
                num1 += num_1;
                int y_1 = Integer.parseInt(num1);
                int x_1 = posicion(letra1);
                
                char letra2 = mov.charAt(5);
                char num_2 = mov.charAt(6);
                num2 += num_2;
                int y_2 = Integer.parseInt(num2);
                int x_2 = posicion(letra2);
                
                if(tablero[y_1][x_1].verifica(mov, tablero)){
                    
                    turno = false;
                }else{
                    System.out.println("Movimiento incorrecto");
                }
                
                
            }else{
                
                
                turno = true;
            }
        }
    }
    public static int posicion(char letra){
        int numero = 0;
        if(letra == 'A'){
            numero = 0;
        }
        if(letra == 'B'){
            numero = 0;
        }
        if(letra == 'C'){
            numero = 0;
        }
        if(letra == 'D'){
            numero = 0;
        }
        if(letra == 'E'){
            numero = 0;
        }
        if(letra == 'F'){
            numero = 0;
        }
        if(letra == 'G'){
            numero = 0;
        }
        if(letra == 'H'){
            numero = 0;
        }
        return numero;
    }
    
    public static void Imprimir(){
        
    }
}
