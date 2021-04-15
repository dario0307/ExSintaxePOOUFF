package questao6;

import java.util.ArrayList;
import java.util.Scanner;


public class Karaoke {
    ArrayList<Musica> disponiveis = new ArrayList();
    ArrayList<Musica> fila = new ArrayList();
    Scanner teclado = new Scanner(System.in);
    public Karaoke() {
        disponiveis.add(new Musica("MGK", "Bloody Valentine"));
        disponiveis.add(new Musica("The Kooks", "Naive"));
        disponiveis.add(new Musica("Snow Patrol", "Open your eyes"));
        disponiveis.add(new Musica("Danny Ocean", "Me rehúso"));
        disponiveis.add(new Musica("Jimmy Eat World", "The Middle"));
    }
    
    
    
    public void adicionarFila(){
        
        System.out.println("DIGITE UM NÚMERO DE ACORDO COM A MÚSICA DESEJADA");
        int cont = 1; 
        for(Musica atual: disponiveis){
            System.out.println(cont+": "+atual.getAutor() + " - " + atual.getMusica());
            cont++;
        }
        int musicaDesejada = teclado.nextInt();
        fila.add(disponiveis.get(musicaDesejada-1));
            
    }
    
    public void mostrarFila(){
        if(!fila.isEmpty()){
            for(Musica atual: fila){
                System.out.println(atual.getAutor() + " - " + atual.getMusica());
            }
        }else{
            System.out.println("Não tem música na fila, adicione uma!");
        }
    }
    //QUANDO QUER IR PARA A PRÓXIMA MÚSICA OU CHEGOU AO FIM
    public void proximaMusica(){
        fila.remove(0);
    }
    
    
    
    
}
