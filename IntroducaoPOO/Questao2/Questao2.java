
package questao2;

public class Questao2 {
   
    public static void main(String[] args) {
       Pessoa dario = new Pessoa();
       dario.nome = "Dario";
       dario.idade = 20;
       dario.fazerAniversario();
       System.out.println("Nome: "+dario.nome+"\nIdade: "+dario.idade);
    }
    
}
