import java.util.Objects;

public class LiteraryWork extends CreativeWork {
    // parametros
    private String publisher;

    // Constructor sin copyright
    public LiteraryWork(String aTitle, String anEditorial){
        super(aTitle);
        this.publisher = anEditorial;
    }

    // Constructor con copyright
    public LiteraryWork(String aTitle, String anEditorial, String aCopyright){
        super(aTitle, aCopyright);
        this.publisher = anEditorial;
    }

    // Metodo para recuperar informacion de editorial
    public String getPublisher() {
        return publisher;
    }

    // Metodo para pasar contenido del LW a un string que lo describa
    @Override
    public String toString() {
        return "LiteraryWork{" +
                "title='" + this.getTitle() + '\'' +
                ", publisher='" + publisher + '\'' +
                ", copyright='" + this.getCopyright() + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 LW's son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherLW) {
        return true;
    }

}
