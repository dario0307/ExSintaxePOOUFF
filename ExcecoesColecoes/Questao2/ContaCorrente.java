package questao2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float limite, float saldo, float valorLimite) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorLimite = valorLimite;
    }

    public void sacar(float valor) throws IllegalArgumentException{
        if(valor < 0){
            throw new IllegalArgumentException("NÃO É POSSÍVEL SACAR VALOR NEGATIVO!");
        }else if(valor > saldo){
            throw new IllegalArgumentException("NÃO É POSSÍVEL RETIRAR ESSE VALOR!");
        }else{
            this.saldo -= valor;
        }
    }

    public void depositar(float valor){
        if(valor < 0){
            throw new IllegalArgumentException("NÃO É POSSÍVEL DEPOSITAR VALOR NEGATIVO!");
        }else{
            this.saldo += valor;
        }
    }
    
    public void setValorLimite(float valor){
        if(valor < 0){
            throw new IllegalArgumentException("NÃO É POSSÍVEL SETAR VALOR NEGATIVO!");
        }else{
            this.valorLimite = valor;
        }
        
        
    }
    
}
