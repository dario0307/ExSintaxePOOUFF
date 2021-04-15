package questao1;

public class Questao1 {

    public static void main(String[] args)throws MenorDeIdade{
        try{
            String teste = "umdoistres";
            int testeNum = Integer.parseInt(teste);
        }catch(IllegalArgumentException e){
            System.out.println("NÃO DA PARA CONVERTER PARA NUMERO(INT)");
        }
        
        
    }
    
}
