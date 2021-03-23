package questao5;

public class PF extends Pessoa {
    private String nome;
    private int cpf;
    private String dataAniver;//NA FORMA "DD/MM/AAAA"

    public PF(String nome, int cpf, String dataAniver, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAniver = dataAniver;
        this.endereço = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataAniver() {
        return dataAniver;
    }

    public void setDataAniver(String dataAniver) {
        this.dataAniver = dataAniver;
    }
    
    
}
