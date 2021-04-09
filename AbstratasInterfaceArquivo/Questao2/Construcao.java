package questao2;

public class Construcao implements CarbonFootprint{
    private int numPessoas;
    private int numLampadas;
    private boolean energiaRenovavel;
    private boolean arCondicionado;
    private int horasArligado;
    
    @Override
    public float getCarbonFootprint(){
        if(this.isEnergiaRenovavel()){
            if(this.isArCondicionado()){
                return this.getNumLampadas()*0.3f+this.getNumPessoas()*1.1f + this.horasArligado*0.8f;
            }
            return this.getNumLampadas()*0.3f+this.getNumPessoas()*1.1f;
            
        }else{
            if(this.isArCondicionado()){
                return this.getNumLampadas()*0.5f+this.getNumPessoas()*1.3f + this.horasArligado*1.1f;
            }
            return this.getNumLampadas()*0.5f+this.getNumPessoas()*1.3f;
        }
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int getNumLampadas() {
        return numLampadas;
    }

    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    public boolean isEnergiaRenovavel() {
        return energiaRenovavel;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}
