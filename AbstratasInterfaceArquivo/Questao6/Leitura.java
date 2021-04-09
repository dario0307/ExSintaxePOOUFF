package questao6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public static void leitura(String nomeArquivo){
        try{
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader  br = new BufferedReader(input);
            String str;
            while( (str = br.readLine()) != null){
                System.out.println(str);
            }
            arquivo.close();
        }catch(IOException e){
        }
    }
    

}
