package questao4;

public class Data {

    public Data(int dia, int mes, int ano) {
        if(mes < 10 && dia < 10){
            System.out.println("0" +dia+ "/" + "0" + mes + "/"+ ano);
        }else if(mes < 10){
            System.out.println(dia+ "/" + "0" + mes + "/"+ ano);
        }else if(dia < 10){
            System.out.println("0" +dia+ "/" + mes + "/"+ ano);
        }else{
            System.out.println(dia+ "/" + mes + "/"+ ano);
        }
    }
    public Data(String mes, int dia, int ano) {
        System.out.println(mes + " " + dia + ", " + ano);
    }
    public Data(int dias, int ano) {
        if(dias < 10){
            System.out.println("00" + dias + " " + ano);
        }else if(dias < 100){
            System.out.println("0" + dias + " " + ano);
        }else{
            System.out.println(dias + " " + ano);
        }
        
        
    }
        
}
