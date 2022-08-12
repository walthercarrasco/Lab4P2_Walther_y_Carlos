
package Ajedrez;

public class Torre extends Piezas{

    public Torre() {
        super();
    }

    public Torre(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2, boolean turno) {
         boolean temporal = true;
        char l1 = mov.charAt(0);
        char l2 = mov.charAt(1);
        char l3 = mov.charAt(4);
        if((l1 == 'r' || l1 == 'R') && tablero[y][x] instanceof Torre){
            if(l2 == '|' && l3 == '-'){
                if(x == x2){
                    while(y != 12){

                    }
                }
            }else{
                temporal = false;
            }
        }else{
            temporal = false;
        }
        return temporal;
    }    
    
}
