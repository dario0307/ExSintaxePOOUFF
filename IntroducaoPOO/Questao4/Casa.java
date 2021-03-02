package questao4;

public class Casa {
    String corCasa;
    boolean porta1;
    boolean porta2;
    boolean porta3;
    
    public boolean abrirFecharP1(){
     return this.porta1 = !this.porta1;   
    }
    public boolean abrirFecharP2(){
     return this.porta2 = !this.porta2;  
    }
    public boolean abrirFecharP3(){
     return this.porta3 = !this.porta3;  
    }
    public int quantasPortasEstaoAbertas(){
        int qtdAbertas = 0;
        if(porta1){
            qtdAbertas++;
        }
        if(porta2){
            qtdAbertas++;
        }
        if(porta3){
            qtdAbertas++;
        }
        return qtdAbertas;
    }
    
}
