package questao1;

public class Quadrado extends Retangulo {
    
    
   
    public void calcularArea(int lado){
        this.setArea(lado*lado);
    }
    public void calcularPerimetro(int lado){
        this.setPerimetro(lado*4);
    }
}
