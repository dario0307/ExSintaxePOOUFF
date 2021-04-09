package questao1;

public class Circulo extends FormaGeometrica {
    
    public void calcularArea(int raio){
        this.setArea(3.14f*(raio*raio));
    }
    
    public void calcularPerimetro(int raio){
        this.setArea(2 * 3.14f* raio);
    }
    
    
}
