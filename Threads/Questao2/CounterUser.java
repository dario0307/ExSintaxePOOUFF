package questao2;

public class CounterUser {

    public static void main(String[] args) {
        //GERANDO COUNTER
        Counter counter = new Counter();
        
        //GERANDO DUAS THREADS
        CounterThread threadDecrementa = new CounterThread(counter, false);
        CounterThread threadIncrementa = new CounterThread(counter, true);
    }
    
}
