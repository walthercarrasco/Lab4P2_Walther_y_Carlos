
package Ajedrez;

public class Peon extends Piezas{
    
    
    
    public Peon() {
        super();
    }

    public Peon(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2, boolean turno) {
        char l1 = mov.charAt(0);
        char l2 = mov.charAt(1);
        char l3 = mov.charAt(4);
        if((l1 == 'p' || l1 == 'P') && tablero[y][x] instanceof Peon){
            if(l2 == '|' && l3 == '-'){
                if(turno == true){
                    if(turno != tablero[y][x].isColor()){
                        if((tablero[y-1][x] == null && y-1 == y2 && x == x2) || (tablero[y][x].isColor() != tablero[y2][x2].isColor() && y-1 == y2 && x-1 == x2) || (tablero[y][x].isColor() != tablero[y2][x2].isColor() && y-1 == y2 && x+1 == x2)){
                            System.out.println("5");
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                    
                }else if(turno == false){
                    if(turno == tablero[y][x].isColor()){
                        if((tablero[y+1][x] == null && y+1 == y2 && x == x2) || (tablero[y][x].isColor() != tablero[y2][x2].isColor() && y+1 == y2 && x-1 == x2) || (tablero[y][x].isColor() != tablero[y2][x2].isColor() && y+1 == y2 && x+1 == x2)){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }                
                }else{
                    return false;
                }
                
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
