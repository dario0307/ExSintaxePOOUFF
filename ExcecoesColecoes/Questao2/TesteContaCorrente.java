package questao2;

public class TesteContaCorrente {
    
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente(0, 0, 4000);
        try{
            conta.sacar(90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }    
        try{
            conta.depositar(-90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }    
        try{
            conta.depositar(90);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }    
        try{
            conta.sacar(1000);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }    
        try{
            conta.sacar(10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }    
    }
    
    
}
