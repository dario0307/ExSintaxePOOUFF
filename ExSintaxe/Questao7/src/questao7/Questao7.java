package questao7;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota = teclado.nextInt();
        float pessimas = 0;
        float ruins = 0;
        float boas = 0;
        float otimas = 0;
        float total = 0;
        while(0 <= nota && nota <= 100){
            if(75 < nota && nota <= 100 ){
                otimas++;
            }else if(50 < nota && nota <= 75){
                boas++;
            }else if(25 < nota && nota <= 50){
                ruins++;
            }else if(0 <= nota && nota <= 25){
                pessimas++;
            }else{
                break;
            }
            total++;
            nota = teclado.nextInt();
        }
        System.out.printf("Otimos: %d porcento\n",(int) ((otimas/total)*100));
        System.out.printf("Bons: %d porcento\n", (int) ((boas/total)*100));
        System.out.printf("Ruins: %d porcento\n", (int) ((ruins/total)*100));
        System.out.printf("Pessimos: %d porcento\n", (int) ((pessimas/total)*100));
    }
    
}
