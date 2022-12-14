
package Ajedrez;
import java.util.Scanner;

public class Ajedrez {
    
    public static void main(String[] args) {
        System.out.println("DATO IMPORTANTE!!!");
        System.out.println("DATO CURIOSO PARA NUILA xd: El origen de la frase jaque mate proviene de la lengua persa y alude a que el rey se encuentra atrapado o no tiene escapatoria. Esto, en el ajedrez, implica perder el juego.");
        
        Scanner lea = new Scanner(System.in);
        System.out.println("Jugador #1: ");
        String jugador1 = lea.next();
        System.out.println("Jugador #2: ");
        String jugador2 = lea.next();
        boolean salida = true;
        boolean turno = true;
        
        
        
        Piezas[][] tablero = new Piezas[8][8];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = null;
            }
        }
        System.out.println("Solo pudimos terminar torre y peones ");
        tablero[0][3] = new Dama('q', 3, 0, false);
        tablero[0][4] = new Rey('k', 4, 0, false);
        tablero[0][2] = new Arfil('b', 2, 0, false);
        tablero[0][5] = new Arfil('b', 5, 0, false);
        tablero[0][1] = new Caballo('n', 1, 0, false);
        tablero[0][6] = new Caballo('n', 6, 0, false);
        tablero[0][0] = new Torre('r', 0, 0, false);
        tablero[0][7] = new Torre('r', 7, 0, false);
        /*for (int i = 0; i < 8; i++) {
            tablero[1][i] = new Peon('p', i, 1, false);
        }*/
        tablero[7][3] = new Dama('Q', 3, 7, true);
        tablero[7][4] = new Rey('K', 4, 7, true);
        tablero[7][2] = new Arfil('B', 2, 7, true);
        tablero[7][5] = new Arfil('B', 5, 7, true);
        tablero[7][1] = new Caballo('N', 1, 7, true);
        tablero[7][6] = new Caballo('N', 6, 7, true);
        tablero[7][0] = new Torre('R', 0, 7, true);
        tablero[7][7] = new Torre('R', 7, 7, true);
        /*for (int i = 0; i < 8; i++) {
            tablero[6][i] = new Peon('P', i, 6, false);
        }*/
        while(salida == true){
            Imprimir(tablero);
            if(turno == true){
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

                
                if(tablero[y_1][x_1].verifica(mov, tablero, x_1, y_1, x_2, y_2, turno) == true){
                    tablero[y_2][x_2] = tablero[y_1][x_1];
                    tablero[y_1][x_1] = null;
                    turno = false;
                }else{
                    System.out.println("Movimiento incorrecto");
                }
                
                
            }else{

                System.out.print(jugador2+" ingrese el movimiento a realizar: ");
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

                if(tablero[y_1][x_1].verifica(mov, tablero, x_1, y_1, x_2, y_2, turno) == true){
                    tablero[y_2][x_2] = tablero[y_1][x_1];
                    tablero[y_1][x_1] = null;
                    turno = true;
                }else{
                    System.out.println("Movimiento incorrecto");
                }
            }
        }
    }
    public static int posicion(char letra){
        int numero = 0;
        if(letra == 'A' || letra == 'a'){
            numero = 0;
        }
        if(letra == 'B' || letra == 'b'){
            numero = 1;
        }
        if(letra == 'C' || letra == 'c'){
            numero = 2;
        }
        if(letra == 'D' || letra == 'd'){
            numero = 3;
        }
        if(letra == 'E' || letra == 'e'){
            numero = 4;
        }
        if(letra == 'F' || letra == 'f'){
            numero = 5;
        }
        if(letra == 'G' || letra == 'g'){
            numero = 6;
        }
        if(letra == 'H' || letra == 'h'){
            numero = 7;
        }
        return numero;
    }
    
    public static void Imprimir(Object[][] tablero){
        System.out.println("[ ][A][B][C][D][E][F][G][H]");
        for (int i = 0; i < 8; i++) {
            System.out.print("["+i+"]");
            for (int j = 0; j < 8; j++) {
                
                if(tablero[i][j] instanceof Piezas){
                    System.out.print("[");
                    System.out.print(((Piezas)tablero[i][j]).getId());
                    System.out.print("]");
                }else{
                    System.out.print("[");
                    System.out.print(" ");
                    System.out.print("]");
                }
                
            }
            System.out.println("");
        }
    }
}
