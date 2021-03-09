package questao7;

public class Pedido {
    Produto [] pedidos = new Produto[4];
    Produto [] estoque = new Produto[4];
    private int indexItens = 0;
    private int indexEstoque = 0;   
    private float totalCompra = 0;
    public int adicionarPedido(String nomeProduto, int quantidade){
        pedidos[indexItens] = new Produto();
        for(int i = 0; i < 4; i++){
            if(nomeProduto.equals(this.estoque[i].getNomeProduto())){
                this.estoque[i].setQuantidade(this.estoque[i].getQuantidade()-quantidade);
                this.totalCompra+= quantidade*estoque[i].getValor();
                this.pedidos[indexItens].setValor(estoque[i].getValor());
            } 
        }
        pedidos[indexItens].setNomeProduto(nomeProduto);
        pedidos[indexItens].setQuantidade(quantidade);
        return this.indexItens +=1;
    }

    public float getTotalCompra() {
        return totalCompra;
    }
    public void adicionarEstoque(String nomeProduto, int quantidadeDisponivel, float valor){
        estoque[indexEstoque] = new Produto();
        estoque[indexEstoque].setNomeProduto(nomeProduto); 
        estoque[indexEstoque].setQuantidade(quantidadeDisponivel);
        estoque[indexEstoque].setValor(valor);
        this.indexEstoque+=1;
    }
    
    
}
