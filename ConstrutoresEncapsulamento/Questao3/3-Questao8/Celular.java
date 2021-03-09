package questao8;

public class Celular {
    private int bateria;

    public Celular() {
        this.bateria = 100;
    }

    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public void enviarMensagem(){
       this.setBateria(this.getBateria()-1);
    }
    public void fazerLigacao(int minutos){
        this.setBateria(this.getBateria()-(minutos*60)/5);
    }
}
