package questao9;

import java.util.ArrayList;

public class Questao9 {

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.calcularArea(10);
        Retangulo r = new Retangulo();
        r.calcularArea(10, 4);
        Quadrado q = new Quadrado();
        q.calcularArea(10);
        Triangulo t  = new Triangulo();
        t.calcularArea(5, 10);
        ArrayList<FormaGeometrica> lista = new ArrayList<>();
        lista.add(t);
        lista.add(q);
        lista.add(r);
        lista.add(c);
        FormaGeometrica.somarTodasArea(lista);
        
    }
    
}
