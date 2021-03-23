package questao9;

public class Quadrado extends Retangulo  {
    public void calcularArea(int lado){
        this.area = lado*lado;
    }
    
    public void calcularPerimetro(int lado){
        this.perimetro = lado*4;
    }
}
