package questao5;

public class Questao5 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarPF("Dario", "03/07/2000", 101615, "Rio de Janeiro");
        agenda.adicionarPJ("Mercearia", 101603, 2000f, "Rua do Cajuezeiro");
        agenda.listarAgenda();
        System.out.println("PROCURAR");
        agenda.procurar(101615);
        agenda.procurar(101603);
    }
    
}
