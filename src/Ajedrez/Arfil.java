
package Ajedrez;

public class Arfil extends Piezas{

    public Arfil() {
        super();
    }

    public Arfil(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2, boolean turno) {
        return true;
    }
    
    
    
}
