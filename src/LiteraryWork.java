/**
 * Trabajo realizado por Valeria Vallejos Franciscangeli
 * Tarea 0 - CC3002 Otoño 2022
 * Clase Trabajo Literario (LiteraryWork), subclase de Trabajo Creativo (CreativeWork)
 * Por cohesion se trabaja con nombres en inglés
 */

public class LiteraryWork extends CreativeWork {
    // parametros
    private String publisher;

    // Constructor con copyright
    public LiteraryWork(String aTitle, String anEditorial, String aCopyright){
        super(aTitle, aCopyright);
        this.publisher = anEditorial;
    }

    // Constructor sin copyright
    public LiteraryWork(String aTitle, String anEditorial){
        this(aTitle, anEditorial, null);
    }

    // Metodo para recuperar informacion de editorial
    public String getPublisher() {
        return publisher;
    }

    // Metodo para pasar contenido del LW a un string que lo describa
    @Override
    public String toString() {
        String aux = super.toString();
        int len = aux.length();
        return "LiteraryWork{" + aux.substring(13,len-1)+
                ", publisher='" + publisher + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 LW's son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherLW) {
        //iguales si son exactamente el mismo dato en la memoria
        if (this == otherLW) return true;
        // no son iguales si el otro no es de clase LiteraryWork
        if (!(otherLW instanceof LiteraryWork)) return false;
        // si nunguno tiene copyright comparamos los titulos y editorial
        if (this.getCopyright()==null && ((LiteraryWork) otherLW).getCopyright()==null){
            return ((LiteraryWork) otherLW).getTitle().equals(this.getTitle()) &&
                    ((LiteraryWork)otherLW).publisher.equals(this.publisher);
        }
        // comparamos titulos y copyright
        if (this.getCopyright()!=null && ((LiteraryWork) otherLW).getCopyright()!=null){
            return ((LiteraryWork) otherLW).getTitle().equals(this.getTitle()) &&
                    ((LiteraryWork)otherLW).publisher.equals(this.publisher) &&
                    ((LiteraryWork)otherLW).getCopyright().equals(this.getCopyright());
        }
        // otro caso: no son iguales
        return false;
    }
}
