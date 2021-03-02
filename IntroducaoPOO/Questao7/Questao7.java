package questao7;

public class Questao7 {

    public static void main(String[] args) {
        Pedido novoPedido = new Pedido();
        novoPedido.adicionarEstoque("Banana",5,4);
        novoPedido.adicionarEstoque("Limao",10,2);
        novoPedido.adicionarEstoque("Cereja",6,1);
        novoPedido.adicionarEstoque("Amora",3,1);
        novoPedido.adicionarPedido("Banana", 3);
        novoPedido.adicionarPedido("Limao", 3);
        novoPedido.adicionarPedido("Cereja", 3);
        System.out.println(novoPedido.totalCompra);
    }
    
}
