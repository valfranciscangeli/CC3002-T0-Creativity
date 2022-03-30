public class Comic extends LiteraryWork{
    String writer;
    String[] cartoonists;
    public Comic(String aTitle, String aCopyright, String anEditorial, String aWriter, String[] listCartoonists){
        super(aTitle,aCopyright,anEditorial);
        this.writer = aWriter;
        this.cartoonists = listCartoonists;
    }

}
