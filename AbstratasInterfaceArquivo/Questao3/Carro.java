package questao3;

public class Carro implements CarbonFootprint{
    private String carro;
    private float cilindrada;
    private int kmRodados;
    @Override
    public float getCarbonFootprint(){
        return this.getKmRodados()*0.323f;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }
}
