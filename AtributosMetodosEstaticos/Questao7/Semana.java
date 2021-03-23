package questao7;

public class Semana {
    private DiaDaSemana diaAtual;
    public void ehDiaUtil(DiaDaSemana dia){
        if(dia.getDia() < 6){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
