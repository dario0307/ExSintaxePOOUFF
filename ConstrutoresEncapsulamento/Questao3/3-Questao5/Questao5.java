package questao5;

public class Questao5 {

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.ligarDesligarTelevisao();
        tv.mudarCanal(30);
        System.out.println(tv.getCanal());
        tv.voltarCanal();
        System.out.println(tv.getCanal());
        tv.proximoCanal();
        tv.proximoCanal();
        System.out.println(tv.getCanal());
        tv.silenciarDessilenciar();
        System.out.println(tv.isSilencioso());
        tv.ligarDesligarTelevisao();
        System.out.println(tv.isLigadaDesligada());
    }
    
}
