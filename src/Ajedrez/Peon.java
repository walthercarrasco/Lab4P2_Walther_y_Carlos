
package Ajedrez;

public class Peon extends Piezas{
    
    
    
    public Peon() {
        super();
    }

    public Peon(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Object[][] tablero, int x, int y, int x2, int y2) {
        char l1 = mov.charAt(0);
        char l2 = mov.charAt(1);
        char l3 = mov.charAt(4);
        if((l1 == 'p' || l1 == 'P') && tablero[y][x] instanceof Peon){
            if(l2 == '|' && l3 == '-'){
                
            }else{
                return false;
            }
        }else{
            return false;
        }
        return true;
    }

    

}
