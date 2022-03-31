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
        String aux = super.toString();
        int len = aux.length();
        return "Movie{" + aux.substring(13, len-1)+
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", cast=" + Arrays.toString(cast) +'\'' +
                '}';
    }

    // Metodo equals para comparar si 2 Movies son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherMovie) {
        //iguales si son exactamente el mismo dato en la memoria
        if (this == otherMovie) return true;
        // no son iguales si el otro no es de clase Movie
        if (!(otherMovie instanceof Movie)) return false;
        // si nunguno tiene copyright comparamos los titulos y editorial
        if (this.getCopyright()==null && ((Movie) otherMovie).getCopyright()==null){
            return ((Movie) otherMovie).getTitle().equals(this.getTitle()) &&
                    ((Movie)otherMovie).director.equals(this.director) &&
                    ((Movie)otherMovie).writer.equals(this.writer) &&
                    Arrays.equals(((Movie) otherMovie).cast, this.cast);
        }
        // comparamos titulos y copyright
        if (this.getCopyright()!=null && ((Movie) otherMovie).getCopyright()!=null){
            return ((Movie) otherMovie).getTitle().equals(this.getTitle()) &&
                    ((Movie)otherMovie).director.equals(this.director) &&
                    ((Movie)otherMovie).writer.equals(this.writer) &&
                    Arrays.equals(((Movie) otherMovie).cast, this.cast) &&
                    ((Movie)otherMovie).getCopyright().equals(this.getCopyright());
        }
        // otro caso: no son iguales
        return false;
    }
}
