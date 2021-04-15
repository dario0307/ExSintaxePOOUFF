package questao3;

public class ClienteJaExistenteException extends Exception {
    public ClienteJaExistenteException(){
        System.out.println("ESSE CLIENTE JÁ FOI INSERIDO ANTERIORMENTE!");
    } 
}
