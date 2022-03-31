public class Novel extends LiteraryWork{
    // parametros
    private String author;

    // constructor sin copyright
    public Novel(String aTitle, String anEditorial, String anAuthor){
        super(aTitle,anEditorial);
        this.author = anAuthor;
    }

    // constructor con copyright
    public Novel(String aTitle, String anEditorial, String anAuthor, String aCopyright){
        super(aTitle,anEditorial,aCopyright);
        this.author = anAuthor;
    }

    // metodos para recuperar informacion de los campos
    public String getAuthor() {
        return author;
    }

    // Metodo para pasar contenido de una Movie a un string que lo describa
    @Override
    public String toString() {
        return "Novel{" +
                "title='" + this.getTitle() + '\'' +
                ", publisher='" + this.getPublisher() + '\'' +
                ", author='" + author + '\'' +
                ", copyright='" + this.getCopyright() + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 Movies son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherNovel){
        return true;
    }
}
