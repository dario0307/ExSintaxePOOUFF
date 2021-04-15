package questao6;

public class Musica {
    private String autor;
    private String musica;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public Musica(String autor, String musica) {
        this.autor = autor;
        this.musica = musica;
    }
    
}
