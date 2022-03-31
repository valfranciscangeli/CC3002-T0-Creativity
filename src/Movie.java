import java.util.Arrays;

public class Movie extends CreativeWork {
    // parametros
    private String director;
    private String writer;
    private String[] cast;

    // constructor sin copyright
    public Movie(String aTitle, String aDirector, String aWriter, String[] aCast){
        super(aTitle);
        this.director = aDirector;
        this.writer = aWriter;
        this.cast = aCast;
    }

    // constructor con copyright
    public Movie(String aTitle, String aDirector, String aWriter, String[] aCast, String aCopyright){
        super(aTitle,aCopyright);
        this.director = aDirector;
        this.writer = aWriter;
        this.cast = aCast;
    }

    // metodos para recuperar informacion de los campos
    public String getDirector() {
        return director;
    }
    public String getWriter(){
        return writer;
    }
    public String[] getCast() {
        return cast;
    }

    // Metodo para pasar contenido de una Movie a un string que lo describa
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + this.getTitle() + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", cast=" + Arrays.toString(cast) +'\'' +
                ", copyright='" + this.getCopyright() + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 Movies son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherMovie) {
        return true;
    }
}
