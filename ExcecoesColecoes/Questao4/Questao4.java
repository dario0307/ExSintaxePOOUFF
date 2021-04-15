package questao4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        
        Scanner teclado  = new Scanner(System.in);
        String frase = teclado.nextLine();
        String[] fraseDividida = frase.split(" ");
        Map<String, Integer> conjunto = new HashMap<>();
        for(int i = 0; i < fraseDividida.length; i++){
            if(conjunto.containsKey(fraseDividida[i])){
                conjunto.put(fraseDividida[i], conjunto.get(fraseDividida[i]) + 1);
            }else{
                conjunto.put(fraseDividida[i], 1);
            }
        }
        for(Map.Entry<String, Integer> entry: conjunto.entrySet()){
            System.out.println("A palavra\""+entry.getKey()+"\" aparece "+ entry.getValue()+ " vezes.");
        }
        
        
    }
}
