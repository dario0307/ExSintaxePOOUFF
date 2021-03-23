package questao9;

public class Triangulo extends FormaGeometrica {
    public void calcularArea(int base, int altura){
        this.area = (base*altura)/2;
    }
    
    public void calcularPerimetro(int lado1, int lado2, int lado3){
        this.perimetro = lado1 + lado2 + lado3;
    }
}
