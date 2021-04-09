package questao5;

public class ItemVenda implements Recebivel{
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    @Override
    public double totalizarReceita(){
        return this.getPrecoUnitario()*this.getQuantidade();
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    
    
    
}
