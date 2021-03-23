package questao9;

import java.util.ArrayList;


public class FormaGeometrica{
    protected float area;
    protected float perimetro;
    
    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    public static <T extends FormaGeometrica> void somarTodasArea(ArrayList<T> todosPoligonos){
        
        float somar = 0;
        for(T atual: todosPoligonos){
            somar  += atual.area; 
        }
        System.out.println(somar);
        
    }
}
