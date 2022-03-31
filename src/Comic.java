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
    public boolean equals(Object otherComic) {
        //iguales si son exactamente el mismo dato en la memoria
        if (this == otherComic) return true;
        // no son iguales si el otro no es de clase Comic
        if (!(otherComic instanceof Comic)) return false;
        // si nunguno tiene copyright comparamos los titulos y editorial
        if (this.getCopyright()==null && ((Comic) otherComic).getCopyright()==null){
            return ((Comic) otherComic).getTitle().equals(this.getTitle()) &&
                    ((Comic)otherComic).getPublisher().equals(this.getPublisher()) &&
                    ((Comic)otherComic).writer.equals(this.writer) &&
                    Arrays.equals(((Comic) otherComic).cartoonists, this.cartoonists);
        }
        // comparamos titulos y copyright
        if (this.getCopyright()!=null && ((Comic) otherComic).getCopyright()!=null){
            return ((Comic) otherComic).getTitle().equals(this.getTitle()) &&
                    ((Comic)otherComic).getPublisher().equals(this.getPublisher()) &&
                    ((Comic)otherComic).writer.equals(this.writer) &&
                    Arrays.equals(((Comic) otherComic).cartoonists, this.cartoonists) &&
                    ((Comic)otherComic).getCopyright().equals(this.getCopyright());
        }
        // otro caso: no son iguales
        return false;
    }
}
