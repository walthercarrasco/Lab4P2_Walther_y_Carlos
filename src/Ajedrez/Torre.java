
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
        if(turno == true){
            if(( l1 == 'R') && tablero[y][x] instanceof Torre){
                if(l2 == '|' && l3 == '-'){
                    if(x == x2){
                        if(y > y2){
                            while(y != y2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                y2++;
                            }
                        }else{
                            while(y != y2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                y2--;

                            }
                        }
                    }else if(y == y2){
                        if(x > x2){
                            while(x != x2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                x2++;
                            }
                        }else{
                            while(x != x2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                x2--;

                            }
                        }
                    }

                }else{
                    temporal = false;
                }
            }else{
                temporal = false;
            }
        }else{
            if((l1 == 'r' ) && tablero[y][x] instanceof Torre){
                if(l2 == '|' && l3 == '-'){
                    if(x == x2){
                        if(y > y2){
                            while(y != y2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                y2++;
                            }
                        }else{
                            while(y != y2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                y2--;

                            }
                        }
                    }else if(y == y2){
                        if(x > x2){
                            while(x != x2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                x2++;
                            }
                        }else{
                            while(x != x2){

                                if(tablero[y2][x2] == null){
                                }else{
                                    temporal = false;
                                }
                                x2--;

                            }
                        }
                    }

                }else{
                    temporal = false;
                }
            }else{
                temporal = false;
            }
        }
        return temporal;
    }    
    
}
