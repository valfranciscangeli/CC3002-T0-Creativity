import java.util.Arrays;

public class Comic extends LiteraryWork{
    // parametros
    private String writer;
    private String[] cartoonists;

    // constructor sin copyright
    public Comic(String aTitle, String anEditorial, String aWriter, String[] listCartoonists){
        super(aTitle,anEditorial);
        this.writer = aWriter;
        this.cartoonists = listCartoonists;
    }

    // constructor con copyright
    public Comic(String aTitle, String anEditorial, String aWriter, String[] listCartoonists, String aCopyright){
        super(aTitle,anEditorial,aCopyright);
        this.writer = aWriter;
        this.cartoonists = listCartoonists;
    }

    // metodos para recuperar informacion de los campos
    public String getWriter() {
        return writer;
    }
    public String[] getCartoonists() {
        return cartoonists;
    }

    // Metodo para pasar contenido de una Movie a un string que lo describa
    @Override
    public String toString() {
        return "Comic{" +
                "title='" + this.getTitle() + '\'' +
                ", publisher='" + this.getPublisher() + '\'' +
                ", writer='" + writer + '\'' +
                ", cartoonists=" + Arrays.toString(cartoonists) + '\'' +
                ", copyright='" + this.getCopyright() + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 Comics son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherComic){
        return true;
    }
}
