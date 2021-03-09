package questao5;

public class Televisao {
    private boolean ligadaDesligada;
    private int volume;
    private int canal;
    private boolean silencioso;

    public boolean isLigadaDesligada() {
        return ligadaDesligada;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isSilencioso() {
        return silencioso;
    }
    
    public void ligarDesligarTelevisao(){
        this.ligadaDesligada = !this.isLigadaDesligada();
    }

    
    public void mudarCanal(int numCanal){
        if(this.isLigadaDesligada()){
            this.setCanal(numCanal);
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void voltarCanal(){
        if(this.isLigadaDesligada()){
            this.setCanal(this.getCanal()-1); 
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }
    public void proximoCanal(){
        if(this.isLigadaDesligada()){
            this.setCanal(this.canal + 1); 
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }
    public void silenciarDessilenciar(){
        this.silencioso = !this.isSilencioso();
    }
    public void aumentarVolume(){
        this.setVolume(this.getVolume()+1);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void diminuirVolume(){
        this.setVolume(this.getVolume()-1);
    }
}
