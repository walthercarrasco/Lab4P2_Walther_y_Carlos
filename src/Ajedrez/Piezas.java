package Ajedrez;

public class Piezas {
    private String[][] tablero = new String[9][9];

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public Piezas() {
    }

    
    public Piezas(String [][] tablero) {
        this.tablero = tablero;
    }
    
    
    
    public boolean movimiento(int x_i, int y_i, int x_m, int y_m, String[][] tablero){
        boolean temporal = true;
        
        return temporal;
    }
    
    public String[][] llenado(){        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = "[ ]";
            }
        }
        
        tablero[0][0] = "[8]";
        tablero[0][1] = "[7]";
        tablero[0][2] = "[6]";
        tablero[0][3] = "[5]";
        tablero[0][4] = "[4]";
        tablero[0][5] = "[3]";
        tablero[0][6] = "[2]";
        tablero[0][7] = "[1]";
        tablero[0][8] = "[ ]";
        
        tablero[0][8] = "[ ]";
        tablero[1][8] = "[A]";
        tablero[2][8] = "[B]";
        tablero[3][8] = "[C]";
        tablero[4][8] = "[D]";
        tablero[5][8] = "[E]";
        tablero[6][8] = "[F]";
        tablero[7][8] = "[G]";
        tablero[8][8] = "[H]";
        
        return tablero;
    }
}
