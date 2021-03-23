package questao2;

public class ConversaoDeUnidadesDeArea {
    //PASSAR METRO PARA PÉS
    public static float metrosToPes(float numero){
        return numero*10.76f;
    }
    //PASSAR PÉS TO CM(METRO*100)
    public static float pesToCm(float numero){
        return numero* 929;
    }
    //PASSAR MILHA PARA ACRE
    public static float milhaToAcre(float numero){
        return numero* 640;
    }
    //PASSAR ACRE PARA PÉS
    public static float acreToPes(float numero){
        return numero*43560;
    }
    //PASSAR PÉS PARA ACRE
    public static float pesToAcre(float numero){
        return numero/43560;
    }
}
