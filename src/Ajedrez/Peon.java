
package Ajedrez;

public class Peon extends Piezas{
    
    
    
    public Peon() {
        super();
    }

    public Peon(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2) {
        char l1 = mov.charAt(0);
        if((l1 == 'p' || l1 == 'P') && tablero[y][x] instanceof Peon){
            
        }
        return false;
    }

    

}
