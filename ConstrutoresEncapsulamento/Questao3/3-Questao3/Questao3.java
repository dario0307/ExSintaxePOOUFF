package questao3;

public class Questao3 {

    public static void main(String[] args) {
        Porta porta = new Porta("Azul", 0.8f, 2f);
        //COMEÇA FECHADA (DEFAULT FALSE)
        porta.abrirFechar();
        System.out.println(porta.estaAberta());
        porta.abrirFechar();
        System.out.println(porta.estaAberta());
    }
    
}
