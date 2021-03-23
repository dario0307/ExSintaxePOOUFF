package questao4;

public class Circulo extends Poligono {
    
    @Override
    public void calcularArea(int raio){
        this.area = 3.14f*(raio*raio);
    }
}
