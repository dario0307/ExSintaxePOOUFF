
package questao2;


public class Pessoa {
   private int idade;
   private String nome;
   public void fazerAniversario(){
       this.setIdade(this.idade+1);
   }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
   
}
