package questao2;

import java.util.Scanner;


public class Questao2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int R = teclado.nextInt();
        int S = teclado.nextInt();
        int T = teclado.nextInt();
        if(R > T & R > S){
            System.out.println("R");
            
        }else if(S> R & S>T){
            System.out.println("S");
        }else{
            System.out.println("T");
        }
    }
}
