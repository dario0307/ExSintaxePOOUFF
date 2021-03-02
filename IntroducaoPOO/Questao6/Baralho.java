package questao6;

public class Baralho {
    Carta [] ouros = new Carta[13];
    Carta [] paus = new Carta[13];
    Carta [] espadas = new Carta[13];
    Carta [] copas = new Carta[13];
    
    public void criarBaralho(){
        for(int i = 0; i < 13; i++){
            ouros[i] = new Carta();
            ouros[i].naipe = "Ouros";
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        ouros[i].valor = "Valete";
                        break;
                    case(12):
                        ouros[i].valor = "Dama";
                        break;
                    case(13):
                        ouros[i].valor = "Rei";             
                        break;
                    case(14):
                        ouros[i].valor = "Ás";
                        break;
                }
            }else{
                ouros[i].valor = Integer.toString(i+2);
            }
            
        }
        for(int i = 0; i < 13; i++){
            paus[i] = new Carta();
            paus[i].naipe = "Paus";
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        paus[i].valor = "Valete";
                        break;
                    case(12):
                        paus[i].valor = "Dama";
                        break;
                    case(13):
                        paus[i].valor = "Rei";             
                        break;
                    case(14):
                        paus[i].valor = "Ás";
                        break;
                }
            }else{
                paus[i].valor = Integer.toString(i+2);
            } 
        }
        for(int i = 0; i < 13; i++){
            espadas[i] = new Carta();
            espadas[i].naipe = "Espadas";
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        espadas[i].valor = "Valete";
                        break;
                    case(12):
                        espadas[i].valor = "Dama";
                        break;
                    case(13):
                        espadas[i].valor = "Rei";             
                        break;
                    case(14):
                        espadas[i].valor = "Ás";
                        break;
                }
            }else{
                espadas[i].valor = Integer.toString(i+2);
            }
        }
        for(int i = 0; i < 13; i++){
            copas[i] = new Carta();
            copas[i].naipe = "Copas";
             if(i+2 > 10){
                switch(i+2){
                    case(11):
                        copas[i].valor = "Valete";
                        break;
                    case(12):
                        copas[i].valor = "Dama";
                        break;
                    case(13):
                        copas[i].valor = "Rei";             
                        break;
                    case(14):
                        copas[i].valor = "Ás";
                        break;
                }
            }else{
                copas[i].valor = Integer.toString(i+2);
            }
        }
    }
    public void mostrarOrdenadoValor(){
        for(int i = 0; i < 13; i++){
            System.out.println(this.ouros[i].valor + " " + this.ouros[i].naipe);
            System.out.println(this.paus[i].valor + " " + this.paus[i].naipe);
            System.out.println(this.copas[i].valor + " " + this.copas[i].naipe);
            System.out.println(this.espadas[i].valor + " " + this.espadas[i].naipe);
            
        }
    }
}
