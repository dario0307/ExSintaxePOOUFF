
package questao1;


public class Agenda {
    Contato contatoAtual[] = new Contato[9];
    private int index = 0;
    public int novoContato(String nome, int numero){
        contatoAtual[index] = new Contato();
        contatoAtual[index].setNome(nome);
        contatoAtual[index].setNumero(numero);
        return this.index+=1; 
    }
}
