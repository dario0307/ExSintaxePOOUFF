package questao2;

public class Bicicleta implements CarbonFootprint{
    //NÃO TEM EMISSÃO DE CARBONO
    @Override
    public float getCarbonFootprint(){
        return 0;
    }
}
