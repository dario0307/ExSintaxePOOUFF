package questao4;

public class Questao4 {

    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.corCasa = "Branca";
        //TODAS PORTAS COMEÇAM FEECHADAS
        casa.abrirFecharP1();
        casa.abrirFecharP2();
        System.out.println(casa.quantasPortasEstaoAbertas());//2
        casa.abrirFecharP1();
        System.out.println(casa.quantasPortasEstaoAbertas());//1
        casa.abrirFecharP1();
        casa.abrirFecharP3();
        System.out.println(casa.quantasPortasEstaoAbertas());//3
    }
    
}
