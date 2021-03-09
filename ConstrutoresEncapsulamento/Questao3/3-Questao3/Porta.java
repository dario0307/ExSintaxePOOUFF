package questao3;

public class Porta {
    private boolean statusPorta;
    private String corPorta;
    private float largura;
    private float altura;

    public String getCorPorta() {
        return corPorta;
    }

    public void setCorPorta(String corPorta) {
        this.corPorta = corPorta;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public boolean estaAberta(){
        return this.statusPorta;
    }
    
    public boolean abrirFechar(){
        return this.statusPorta = !this.statusPorta;
    }
    
    public Porta(String corPorta, float largura, float altura) {
        this.corPorta = corPorta;
        this.largura = largura;
        this.altura = altura;
    }
    
    
}
