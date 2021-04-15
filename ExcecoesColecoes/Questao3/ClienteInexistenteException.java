package questao3;

public class ClienteInexistenteException extends Exception {
    public ClienteInexistenteException(){
        System.out.println("O CLIENTE NÃO ESTÁ CADASTRADO!");
    }
}
