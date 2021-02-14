package questao6;

public class Questao6 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 0;
        int fibonacci = 0;
        while(fibonacci < 100){
            System.out.println(fibonacci);
            fibonacci = n1 + n2;
            n2 = n1;
            n1 = fibonacci;
            
            
        }
    }
    
}
