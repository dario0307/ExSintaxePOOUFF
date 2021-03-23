package questao9;

public class Retangulo extends FormaGeometrica  {
    public void calcularArea(int lado1, int lado2){
        this.area = lado1*lado2;
    }
    
    public void calcularPerimetro(int lado1, int lado2){
        this.perimetro = lado1*2 + lado2*2;
    }
}
