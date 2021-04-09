package questao1;

public class Retangulo extends FormaGeometrica{
  
   
    public void calcularArea(int altura, int base){
        this.setArea(altura*base);
    }
    public void calcularPerimetro(int altura, int base){
        this.setPerimetro((2* altura )+ (base *2));
    }
}
