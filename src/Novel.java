public class Novel extends LiteraryWork{
    String author;
    public Novel(String aTitle, String aCopyright, String anEditorial, String anAuthor){
        super(aTitle,aCopyright,anEditorial);
        this.author = anAuthor;
    }

}
