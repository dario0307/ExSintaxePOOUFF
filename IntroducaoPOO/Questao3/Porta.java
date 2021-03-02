package questao3;

public class Porta {
    boolean statusPorta;
    String corPorta;
    float largura;
    float altura;
    
    public boolean estaAberta(){
        return this.statusPorta;
    }
    public boolean abrirFechar(){
        return this.statusPorta = !this.statusPorta;
    }
}
