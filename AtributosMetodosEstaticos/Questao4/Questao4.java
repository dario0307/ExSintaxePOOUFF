package questao4;

public class Questao4 {

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.calcularArea(5);
        System.out.println("Área quadrado = "+q.getArea());
        
        Retangulo r =  new Retangulo();
        r.calcularArea(5,4);
        System.out.println("Área retângulo = "+r.getArea());
        
        Triangulo t = new Triangulo();
        t.calcularArea(5,2);
        System.out.println("Área triângulo = "+t.getArea());
        
        Circulo c = new Circulo();
        c.calcularArea(10);
        System.out.println("Área círculo = "+c.getArea());
        
    }
    
}
