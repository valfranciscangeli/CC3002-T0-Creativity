public class LiteraryWork extends CreativeWork {
    String publisher;
    public LiteraryWork(String aTitle, String aEditorial){
        super(aTitle);
        this.publisher = aEditorial;
    }
    public LiteraryWork(String aTitle, String aCopyright, String anEditorial){
        super(aTitle, aCopyright);
        this.publisher = anEditorial;
    }
}
