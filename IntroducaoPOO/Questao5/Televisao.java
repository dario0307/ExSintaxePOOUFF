package questao5;

public class Televisao {
    boolean ligadaDesligada;
    int volume;
    int canal;
    boolean silencioso;
    
    public void ligarDesligarTelevisao(){
        this.ligadaDesligada = !this.ligadaDesligada;
    }
    public void mudarCanal(int numCanal){
        if(this.ligadaDesligada){
            this.canal = numCanal; 
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }
    public void voltarCanal(){
        if(this.ligadaDesligada){
            this.canal -= 1; 
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }
    public void proximoCanal(){
        if(this.ligadaDesligada){
            this.canal += 1; 
        }else{
            System.out.println("Tem que ligar a TV");
        }
    }
    public void silenciarDessilenciar(){
        this.silencioso = !this.silencioso;
    }
    public void aumentarVolume(){
        this.volume +=1;
    }
    public void diminuirVolume(){
        this.volume -=1;
    }
}
