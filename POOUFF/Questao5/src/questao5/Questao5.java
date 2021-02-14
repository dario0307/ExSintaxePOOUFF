package questao5;

import java.util.Scanner;

public class Questao5 {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numFatorial = teclado.nextInt();
        int resultadoFatorial = numFatorial;
        int aux = numFatorial-1;
        if(numFatorial >= 0 ){
            while(aux > 1 ){
                resultadoFatorial *= aux--;
            }
            if(numFatorial < 2){
                System.out.println(1);
            }else{
                System.out.println(resultadoFatorial);
            }
        }else{
            System.out.println(-1);
        }
    }
    
}
