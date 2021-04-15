package questao5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Questao5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("teste0");
        lista.add("teste1");
        lista.add("teste2");
        lista.add("teste");
        lista.add("teste");
        System.out.println(lista.toString());
        //ArrayList para HashSet
        HashSet<String> conjunto = new HashSet(lista);
        System.out.println(conjunto.toString());
        //HashSet para PriorityQueue
        PriorityQueue<String> filaPrioridade = new PriorityQueue(conjunto);
        System.out.println(filaPrioridade.toString());
        //PriorityQueue para ArrayDeque
        ArrayDeque<String>  filaComDoisFinais = new ArrayDeque(filaPrioridade);
        System.out.println(filaComDoisFinais.toString());
        //ArrayDeque para TreeSet
        TreeSet<String> arvore = new TreeSet(filaComDoisFinais);
        System.out.println(arvore.toString());
    }
    //O print seria com conteúdo igual casoo não houvesse um elemento repetido.
    //pois durante a transformação para HashSet, ele retira o elemento repetido e o memso não tem ordem
    //diferente do ArrayList que ordena de acordo com a sequencia dos elementos inseridos
    //Embora todos sejam Collections, eles possuem regras diferentes um dos outros para ordenação como no exemplo citado a cima.
}
