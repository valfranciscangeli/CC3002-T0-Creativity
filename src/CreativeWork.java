public class CreativeWork {
    //parametros
    private String title;
    private String copyright = null;

    // Constructor cuando no hay copyright
    public CreativeWork(String aTitle){
        this.title = aTitle;
    }

    // Constructor con copyright
    public CreativeWork(String aTitle, String aCopyright){
        this.title = aTitle;
        this.copyright = aCopyright;
    }

    // Metodos para recuperar campos de un CreativeWork
    public String getTitle(){
        return this.title;
    }

    public String getCopyright(){
        return this.copyright;
    }

    // Metodo para pasar contenido del CW a un string que lo describa
    @Override
    public String toString() {
        return "Creativework{" +
                "title='" + title + '\'' +
                ", copyright='" + copyright + '\'' +
                '}';
    }

    // Metodo equals para comparar si 2 CW's son iguales (en memoria y/o en contenido)
    @Override
    public boolean equals(Object otherCW){
        if (this == otherCW) return true;
        if (!(otherCW instanceof CreativeWork)) return false;
        // else
        if (this.copyright==null && ((CreativeWork) otherCW).copyright==null){
            return ((CreativeWork)otherCW).title.equals(this.title);
        }
        if (this.copyright!=null && ((CreativeWork) otherCW).copyright!=null){
            return ((CreativeWork)otherCW).title.equals(this.title) &&
                ((CreativeWork)otherCW).copyright.equals(this.copyright);
        }
        return false;
    }

    // Metodo que revisa si el CW tiene copyright
    public boolean hasCopyright(){
        return this.copyright!=null;
    }
}
