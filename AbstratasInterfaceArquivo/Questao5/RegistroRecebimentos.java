package questao5;

import java.util.ArrayList;

public class RegistroRecebimentos {
    public ArrayList<Recebivel> listaRecebiveis = new ArrayList();
    private double valorTotal;
    
    public void adicionarServico(String descricao, int horas, float preco){
        Servico service = new Servico();
        service.setDescricao(descricao);
        service.setHoras(horas);
        service.setPrecoHora(preco);
        listaRecebiveis.add(service);
    }
    
    public void adicionarItem (String produto, int quantidade, float preco){
        ItemVenda item = new ItemVenda();
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setPrecoUnitario(preco);
        listaRecebiveis.add(item);
    }
    
    public void listarRegistros (){
        listaRecebiveis.forEach((i)->{
            if(i instanceof ItemVenda){
                System.out.println(((ItemVenda)i).getProduto());
                System.out.println(((ItemVenda)i).getPrecoUnitario());
                System.out.println(((ItemVenda)i).getQuantidade());
            }else{
                System.out.println(((Servico)i).getDescricao());
                System.out.println(((Servico)i).getPrecoHora());
                System.out.println(((Servico)i).getHoras());
            }
        });
    }
    
    public void valorTotal(){
        listaRecebiveis.forEach((i)->{
            if(i instanceof ItemVenda){
               this.valorTotal += ((ItemVenda)i).totalizarReceita();
            }else{
            this.valorTotal += ((Servico)i).totalizarReceita();
            }
        });
	System.out.println(this.valorTotal);	
    }
}
