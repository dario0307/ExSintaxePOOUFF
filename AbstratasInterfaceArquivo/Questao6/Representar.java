package questao6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Representar {
    public static void representar (String nomeArquivo){
        try{
            
            FileReader fr = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fr);
            int diaMes;
            int indice;
            double tempMax;
            double tempMin;
            
            String str;
            while((str = br.readLine())!= null){
                String[] linhaAtual = str.split(", ");
                diaMes = Integer.parseInt(linhaAtual[0]);
                tempMin = Integer.parseInt(linhaAtual[1]);
                tempMax = Double.parseDouble(linhaAtual[2]);
                indice = Integer.parseInt(linhaAtual[3]);
                System.out.println("Dia:"+diaMes+" -Teperatura mínima:"+ tempMin +" -Teperatura máxima:"+ tempMax +" -Indice:" +indice);
            }
            br.close();
        }catch(IOException e){
            
        }
    }
}
