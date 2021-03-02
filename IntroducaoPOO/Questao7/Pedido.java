package questao7;

public class Pedido {
    Produto [] pedidos = new Produto[4];
    Produto [] estoque = new Produto[4];
    int indexItens = 0;
    int indexEstoque = 0;   
    float totalCompra = 0;
    public int adicionarPedido(String nomeProduto, int quantidade){
        pedidos[indexItens] = new Produto();
        for(int i = 0; i < 4; i++){
            if(nomeProduto.equals(this.estoque[i].nomeProduto)){
                this.estoque[i].quantidade -= quantidade;
                this.totalCompra+= quantidade*estoque[i].valor;
                this.pedidos[indexItens].valor = estoque[i].valor;
            } 
        }
        pedidos[indexItens].nomeProduto = nomeProduto;
        pedidos[indexItens].quantidade = quantidade;
        return this.indexItens +=1;
    }
    public void adicionarEstoque(String nomeProduto, int quantidadeDisponivel, float valor){
        estoque[indexEstoque] = new Produto();
        estoque[indexEstoque].nomeProduto = nomeProduto;
        estoque[indexEstoque].quantidade = quantidadeDisponivel;
        estoque[indexEstoque].valor = valor;
        this.indexEstoque+=1;
    }
    
    
}
