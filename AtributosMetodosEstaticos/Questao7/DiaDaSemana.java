package questao7;

public enum DiaDaSemana {
    DOMINGO(7),
    SEGUNDA(1),
    TERÇA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SÁBADO(6);
    private int dia;

    private DiaDaSemana(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
    
}
