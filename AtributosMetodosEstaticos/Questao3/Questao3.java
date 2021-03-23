package questao3;

public class Questao3 {

    public static void main(String[] args) {
        Pessoa dario = new Pessoa("Dario",20);
        dario.mae = new Pessoa("Mamãe",503);
        dario.pai = new Pessoa("Papai",480);
        System.out.println("Nome do Filho:" + dario.getNome());
        System.out.println("Nome da Mãe:" + dario.mae.getNome());
        System.out.println("Nome do Filho:" + dario.pai.getNome());
        
    }
    
}
