
package Ajedrez;

public class Caballo extends Piezas{

    public Caballo() {
        super();
    }

    public Caballo(char id, int x, int y, boolean color) {
        super(id, x, y, color);
    }

    @Override
    public boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
