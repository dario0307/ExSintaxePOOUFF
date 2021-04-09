package questao6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever {
    public static void escrever(String nomeArquivo){
        try{
            Scanner teclado = new Scanner(System.in);
            String entrada = teclado.nextLine();
            File arquivo = new File(nomeArquivo);
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(entrada);
            bw.flush();
            bw.close();
        }catch(IOException e){
            
        }
    }
}
