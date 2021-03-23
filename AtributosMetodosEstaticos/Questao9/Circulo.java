package questao9;

public class Circulo extends FormaGeometrica  {
    public void calcularArea(int raio){
        this.area = (raio*raio)*3.14f;
    }
    
    public void calcularPerimetro(int raio){
        this.perimetro = 3.14f*2*raio;
    }
}
