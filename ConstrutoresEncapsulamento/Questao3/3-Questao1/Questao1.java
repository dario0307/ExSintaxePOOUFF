
package questao1;


public class Questao1 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.novoContato("Francisco", 123);
        agenda.novoContato("Dario",456);
        System.out.println(agenda.contatoAtual[0].getNome());
        System.out.println(agenda.contatoAtual[0].getNumero());
        System.out.println(agenda.contatoAtual[1].getNome());
        System.out.println(agenda.contatoAtual[1].getNumero());
    }
    
}
