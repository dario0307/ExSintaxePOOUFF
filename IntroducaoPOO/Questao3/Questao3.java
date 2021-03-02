package questao3;

public class Questao3 {

    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.altura = 2.1f ;
        porta.largura = 0.8f;
        porta.corPorta = "Azul";
        //COMEÇA FECHADA (DEFAULT FALSE)
        porta.abrirFechar();
        System.out.println(porta.estaAberta());
        porta.abrirFechar();
        System.out.println(porta.estaAberta());
    }
    
}
