package questao7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binario {
    public static void armazenar(String nomeArquivo){
        File arquivo = new File(nomeArquivo);
        try{
            Scanner teclado = new Scanner(System.in);
            FileOutputStream write = new FileOutputStream(arquivo, true);
            BufferedOutputStream bs = new BufferedOutputStream(write);
            String entrada = teclado.nextLine();
            bs.write(entrada.getBytes());
            bs.write("\n".getBytes());
            bs.flush();
            bs.close();
            
        }catch(IOException e){
            
        }
    }
    public static void recuperar(String nomeArquivo){
        try{
            FileInputStream read = new FileInputStream(nomeArquivo);
            BufferedInputStream bs = new BufferedInputStream(read);
            int conteudo;
            while((conteudo = bs.read()) != -1){
                System.out.println(conteudo);
            }
        }catch(IOException e){
            
        }
    }
}
