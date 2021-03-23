package questao5;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Agenda {
    ArrayList<Pessoa> listaPessoa = new ArrayList <>();
    private int index = 0;
    
    public void adicionarPF(String nome, String niver, int CPF, String endereco){
        listaPessoa.add(new PF(nome, CPF, niver,endereco));
        index+=1;
    }
    
    public void adicionarPJ(String razaoSocial, int CNPJ, float faturamento, String endereco){
        listaPessoa.add( new PJ(razaoSocial, CNPJ, faturamento, endereco));
        index+=1;
    }
    
    public void listarAgenda(){
        listaPessoa.forEach((i) -> {
            if(i instanceof PF){
                System.out.println(((PF)i).getNome());
                System.out.println(((PF) i).getCpf());
                System.out.println(((PF) i).getDataAniver());
                System.out.println(((PF) i).getEndereço());
            }else{
                System.out.println(((PJ)i).getRazaoSocial());
                System.out.println(((PJ)i).getCnpj());
                System.out.println(((PJ)i).getFaturamento());
                System.out.println(((PJ)i).getEndereço());
            }
        });
    }
    
    public void procurar(int cpfCNPJ){
        for(Pessoa i: listaPessoa){
            if(i instanceof PF){
                if(((PF) i).getCpf() == cpfCNPJ){
                    System.out.println(((PF) i).getNome());
                    System.out.println(((PF) i).getCpf());
                    System.out.println(((PF) i).getDataAniver());
                    System.out.println(((PF) i).getEndereço());
                }}else if(((PJ) i).getCnpj()== cpfCNPJ){
                System.out.println(((PJ) i).getRazaoSocial());
                System.out.println(((PJ) i).getCnpj());
                System.out.println(((PJ) i).getFaturamento());
                System.out.println(((PJ) i).getEndereço());
            }
        }
    }
}
