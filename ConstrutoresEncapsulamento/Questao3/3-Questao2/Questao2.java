
package questao2;

public class Questao2 {
   
    public static void main(String[] args) {
       Pessoa dario = new Pessoa(20,"Dario");
       dario.fazerAniversario();
       System.out.println("Nome: "+dario.getNome()+"\nIdade: "+dario.getIdade());
    }
    
}
