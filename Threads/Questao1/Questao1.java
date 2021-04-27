package questao1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NumeroInputado numero = new NumeroInputado(teclado.nextInt());
        CalculandoPrimos thread1 = new CalculandoPrimos(numero,true);
        CalculandoPrimos thread2 = new CalculandoPrimos(numero,false);
        try{
            thread1.join();
            thread2.join();
        }catch(InterruptedException e){
            
        }
        System.out.println(NumeroInputado.qtdPrimos);
        
    }
    
}
