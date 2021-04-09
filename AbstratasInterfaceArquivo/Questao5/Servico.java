package questao5;

public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;
    
    @Override
    public double totalizarReceita(){
        return this.getHoras()*this.precoHora;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
    
}
