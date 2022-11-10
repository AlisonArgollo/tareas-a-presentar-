import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        String [] tablero = {"_","_","_","_","_","_","_","_","_"};
        int tiros = 0;
         boolean alguienGano = false;
        do{
            Showtablero(tablero);
            //para estableces los turnos de cada jugador
            String ficha = tiros%2==0? "X":"O";
            juegaplayer(ficha, tablero);
            alguienGano = evaluateWin(tablero);
            if(alguienGano)System.out.println("GANASTE, player " + ficha);
            tiros++;
        }while (!alguienGano);
    //generamos el tablero
    }
    static void Showtablero (String [] tablero){
        System.out.println( tablero[0] + "|" + tablero[1] + "|" + tablero[2] );
        System.out.println( tablero[3] + "|" + tablero[4] + "|" + tablero[5] );
        System.out.println( tablero[6] + "|" + tablero[7] + "|" + tablero[8] );
    }

    static void juegaplayer (String ficha, String [] tablero){
        Scanner leer = new Scanner(System.in);
        System.out.println("Qué posición quiere " + ficha + "?" );
        int posicion = leer.nextInt();
        tablero[posicion]= ficha;
    }
  static boolean evaluateWin(String tablero[]) {
    if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")){
      return true; 
    }else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")){
      return true; 
    }else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")){
      return true; 
    }else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")){
      return true; 
    }else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")){
      return true; 
    }else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")){
      return true; 
    }else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")){
      return true; 
    }else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")){
      return true; 
    }
    return false;
    
  }
   
}