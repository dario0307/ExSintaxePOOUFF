
package questao1;


public class Agenda {
    Contato contatoAtual[] = new Contato[9];
    int index = 0;
    public int novoContato(String nome, int numero){
        contatoAtual[index] = new Contato();
        contatoAtual[index].nome = nome;
        contatoAtual[index].numero = numero;
        return this.index+=1; 
    }
}
