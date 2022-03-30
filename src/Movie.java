public class Movie extends CreativeWork {
    String director;
    String writer;
    String[] cast;

    public Movie(String aTitle, String aCopyright, String aDirector, String aWriter, String[] aCast){
        super(aTitle,aCopyright);
        this.director = aDirector;
        this.writer = aWriter;
        this.cast = aCast;
    }
}
