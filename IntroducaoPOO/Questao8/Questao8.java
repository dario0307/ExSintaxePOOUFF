package questao8;

public class Questao8 {

    public static void main(String[] args) {
        Celular smartphone =  new Celular();
        System.out.println(smartphone.nivelBateria());
        smartphone.enviarMensagem();
        smartphone.fazerLigacao(2);//TEMPO EM MINUTOS
        System.out.println(smartphone.nivelBateria());
    }
}
