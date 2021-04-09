package questao4;
//funcionários assalariados/comissionados recebem um salário-base mais uma porcentagem sobre suas vendas.
public class FuncionariosAssalariadosComissionados {
    protected float salarioTotal;
    private float salarioFixo;
    private float vendasTotal;

    public float getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(float salarioTotal) {
        this.salarioTotal = this.getSalarioFixo() + this.getVendasTotal() * 0.05f;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getVendasTotal() {
        return vendasTotal;
    }

    public void setVendasTotal(float vendasTotal) {
        this.vendasTotal = vendasTotal;
    }
    
    
}
