package questao4;

public class Poligono {
    protected float area;

    public float getArea() {
        return area;
    }
    
    public void calcularArea(int raioOuLado){
        System.out.println("Serve para circulo e quadrado");
    }
    
    public void calcularArea(int baseLado, int alturaLado){
        System.out.println("Serve para triângulo e retângulo");
    }
    
            
}
