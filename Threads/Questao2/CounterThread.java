package questao2;

import java.util.Random;

public class CounterThread extends Thread {
    private Counter counter;
    private boolean incDec;
    private Random tempo;
    
    public CounterThread(Counter counter, boolean incDec) {
        this.counter = counter;
        this.incDec = incDec;
        this.start();
    }
    
    @Override
    public void run(){
        //SE TRUE INCREMENTAR
        if(incDec){
            for(int i = 0; i < 20; i++){
                counter.increment();
                try{
                    Thread.sleep(tempo.nextInt(500));
                }catch(InterruptedException e){
                }
            }
        //SE FALSE DECREMENTAR
        }else{
            for(int i = 0; i < 20; i++){
                counter.decrement();
                try{
                    Thread.sleep(tempo.nextInt(500));
                }catch(InterruptedException e){
                }
            }
        }
    }
}
