package questao4;

public class FuncionarioAssalariadoComissionadoAumento extends FuncionariosAssalariadosComissionados {
    @Override
    public void setSalarioTotal(float salarioTotal){
        this.salarioTotal = (this.getSalarioFixo() + this.getVendasTotal()*0.05f)*1.1f;
    }//REALIZANDO AUMENTO DO SALÁRIO DE 10% POR POLIMORFISMO @OVERRIDE
}
