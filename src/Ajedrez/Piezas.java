package Ajedrez;

public abstract class Piezas {
    private char id;
    private int x;
    private int y;
    private boolean color;
    

    public Piezas() {
    }

    public Piezas(char id, int x, int y, boolean color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    
    public abstract boolean verifica(String mov, Piezas[][] tablero, int x, int y, int x2, int y2, boolean turno);
   
}
