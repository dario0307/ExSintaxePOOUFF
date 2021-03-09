package questao6;

public class Baralho {
    Carta [] ouros = new Carta[13];
    Carta [] paus = new Carta[13];
    Carta [] espadas = new Carta[13];
    Carta [] copas = new Carta[13];
    
    private void criarBaralho(){
        for(int i = 0; i < 13; i++){
            ouros[i] = new Carta();
            ouros[i].setNaipe("Ouros");
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        ouros[i].setValor("Valete");
                        break;
                    case(12):
                        ouros[i].setValor("Dama");
                        break;
                    case(13):
                        ouros[i].setValor("Rei");
                        break;
                    case(14):
                        ouros[i].setValor("Ás");
                        break;
                }
            }else{
                ouros[i].setValor(Integer.toString(i+2));
            }
            
        }
        for(int i = 0; i < 13; i++){
            paus[i] = new Carta();
            paus[i].setNaipe("Paus");
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        paus[i].setValor("Valete");
                        break;
                    case(12):
                        paus[i].setValor("Dama");
                        break;
                    case(13):
                        paus[i].setValor("Rei");             
                        break;
                    case(14):
                        paus[i].setValor("Ás");
                        break;
                }
            }else{
                paus[i].setValor(Integer.toString(i+2));
            } 
        }
        for(int i = 0; i < 13; i++){
            espadas[i] = new Carta();
            espadas[i].setNaipe("Espadas");
            if(i+2 > 10){
                switch(i+2){
                    case(11):
                        espadas[i].setValor("Valete");
                        break;
                    case(12):
                        espadas[i].setValor("Dama");
                        break;
                    case(13):
                        espadas[i].setValor("Rei");             
                        break;
                    case(14):
                        espadas[i].setValor("Ás");
                        break;
                }
            }else{
                espadas[i].setValor(Integer.toString(i+2));
            }
        }
        for(int i = 0; i < 13; i++){
            copas[i] = new Carta();
            copas[i].setNaipe("Copas");
             if(i+2 > 10){
                switch(i+2){
                    case(11):
                        copas[i].setValor("Valete");
                        break;
                    case(12):
                        copas[i].setValor("Dama");
                        break;
                    case(13):
                        copas[i].setValor("Rei");             
                        break;
                    case(14):
                        copas[i].setValor("Ás");
                        break;
                }
            }else{
                copas[i].setValor(Integer.toString(i+2));
            }
        }
    }
    public void mostrarOrdenadoValor(){
        for(int i = 0; i < 13; i++){
            System.out.println(this.ouros[i].getValor() + " " + this.ouros[i].getNaipe());
            System.out.println(this.paus[i].getValor() + " " + this.paus[i].getNaipe());
            System.out.println(this.copas[i].getValor() + " " + this.copas[i].getNaipe());
            System.out.println(this.espadas[i].getValor() + " " + this.espadas[i].getNaipe());
            
        }
    }

    public Baralho() {
        criarBaralho();
    }
    
}
