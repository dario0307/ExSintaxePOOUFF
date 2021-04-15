package questao3;

public class Cliente {
    String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException{
        if(cpf.length()!= 11){
            throw new DadoInvalidoException();
        }
        this.cpf = cpf;
    }
    
    
}
