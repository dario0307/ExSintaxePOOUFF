package questao1;

import java.util.Scanner;


public class Questao1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdNumeros = teclado.nextInt();
        int qtdNegativos  = 0;
        for (int i = 0; i < qtdNumeros; i++){
            int numeroAtual = teclado.nextInt();
            if(numeroAtual < 0 ){
                qtdNegativos++;
            }
        }
        System.out.println(qtdNegativos);
    }
}
    
