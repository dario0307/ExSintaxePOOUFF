package questao2;

public class Questao2 {

   public static void main(String[] args) {
       float areaDoCampo = 8250f;
       areaDoCampo = ConversaoDeUnidadesDeArea.metrosToPes(areaDoCampo);
       System.out.println(areaDoCampo+" pés²");
       areaDoCampo = ConversaoDeUnidadesDeArea.pesToAcre(areaDoCampo);
       System.out.println(areaDoCampo+" acre");
       //VOLTAR PARA PES E DEPOIS CM
       areaDoCampo = ConversaoDeUnidadesDeArea.acreToPes(areaDoCampo);
       areaDoCampo = ConversaoDeUnidadesDeArea.pesToCm(areaDoCampo);
       System.out.println(areaDoCampo+" cm²");
       
       
   }
    
}
