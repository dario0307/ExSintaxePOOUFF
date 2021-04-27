package questao1;

public class CalculandoPrimos extends Thread {
    private NumeroInputado numero;
    private boolean parte;
    
    
    public CalculandoPrimos(NumeroInputado n, boolean parte) {
       this.numero = n;
       this.parte = parte;
       start();
    }
    
    @Override
    public void run(){
        
        
        try{//SE A PARTE FOR TRUE PEGA SEGUNDA METADE 
            if(parte){
            calculando(numero.getNumero()/2,numero.getNumero());
            //SE A PARTE FOR FALSE PEGA PRIMEIRA METADE
            }else{
                calculando(1,numero.getNumero()/2);
            }
        }catch(IllegalArgumentException e){
        }
        
       
    }
    
    private void calculando(int inicio, int fim){
        for(int i = inicio; i < fim; i++){
            boolean verifica = verificaPrimo(i);
            if(verifica){
              NumeroInputado.qtdPrimos += 1;
            }
        }
        
        
    }
    
    private boolean verificaPrimo(int numero){
        boolean ehOuNao = true;
        int qtdDivisores = 0;
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0 ){
                qtdDivisores++;
            }
        }
        if(qtdDivisores == 2){
            return ehOuNao;
        }
        return !ehOuNao;
    }
    
}
