package questao4;
//funcionários comissionados recebem uma porcentagem sobre suas vendas 
public class FuncionariosComissionados {
    private float salarioTotal;
    private float valorVendas;

    public float getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(float salarioTotal) {
        this.salarioTotal += this.getValorVendas() *0.05f;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }
}
