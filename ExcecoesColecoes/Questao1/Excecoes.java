package questao1;

public class Excecoes {
    public static void multiplica(String num){
        try{
            int number = Integer.parseInt(num);
            System.out.println(number*2);
        }catch(NumberFormatException e){ //NumberFormatException é lançada quando 
                                        //tenta converter a string para tipos númericos, 
                                        //mas não estava no formato correto
            System.out.println("Tentou converter a string para tipos númericos, mas não estava no formato correto");
        }
        
    } 
}
