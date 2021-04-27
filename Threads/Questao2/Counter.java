package questao2;

import java.util.Random;

public class Counter {
        private double count;
        private Random tempo;
        
    public synchronized void increment(){
        if (count < 3){
            this.count += 1;
            System.out.println("Incremento ocorrido, valor atual do count = "+ this.count);
            
        }else{
            System.out.println("Chegou a 3, não é possível aumentar mais, thread espearando");
            try{
               Thread.sleep(tempo.nextInt(500));
            }catch(InterruptedException e){
            }
        }
    }

    public synchronized void decrement(){
        if(count > 0){
            this.count -= 1;
            System.out.println("Decremento ocorrido, valor atual do count = "+ this.count);
          
        }else{
            System.out.println("Chegou a 0, não é possível diminuir mais, thread espearando");
            try{
               Thread.sleep(tempo.nextInt(500));
            }catch(InterruptedException e){
            
        }
            
        }
    }

    
    
    
    
    
    
    
}
