package questao4;

public class Casa {
    private String corCasa;
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;
    
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
        if(this.isPorta1()){
            qtdAbertas++;
        }
        if(this.isPorta2()){
            qtdAbertas++;
        }
        if(this.isPorta3()){
            qtdAbertas++;
        }
        return qtdAbertas;
    }

    public Casa(String corCasa) {
        this.corCasa = corCasa;
    }

    public boolean isPorta1() {
        return porta1;
    }

    public boolean isPorta2() {
        return porta2;
    }

    public boolean isPorta3() {
        return porta3;
    }
    
}
