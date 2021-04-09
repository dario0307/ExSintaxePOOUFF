package questao2;

import java.util.ArrayList;

public class Questao2 {

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> lista = new ArrayList();
        //BIKE
        Bicicleta b0 = new Bicicleta();
        lista.add(b0);
        Bicicleta b1 = new Bicicleta();
        lista.add(b1);
        //CARROS
        Carro c0 = new Carro();
        c0.setKmRodados(10);
        lista.add(c0);
        Carro c1 = new Carro();
        c0.setKmRodados(10);
        lista.add(c1);
        //CONSTRUÇÕES
        Construcao cons0 = new Construcao();
        lista.add(cons0);
        Construcao cons1 = new Construcao();
        lista.add(cons1);
        
        
        //KG DE CARBONO GERADO
        float carbonKG = 0;

        for(CarbonFootprint i : lista){
            carbonKG += i.getCarbonFootprint();
        }
        System.out.println(carbonKG + "kG CO²");
    }
    
}
