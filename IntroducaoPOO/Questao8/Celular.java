package questao8;

public class Celular {
    int bateria = 100;
    public void enviarMensagem(){
        this.bateria -= 1;
    }
    public void fazerLigacao(int minutos){
        this.bateria -= (minutos*60)/5;
    }
    public int nivelBateria(){
        return this.bateria;
    }
}
