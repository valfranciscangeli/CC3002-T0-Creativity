public class CreativeWork {
    //parametros
    private String title;
    private String copyright;

    // Constructor con copyright
    public CreativeWork(String aTitle, String aCopyright){
        this.title = aTitle;
        this.copyright = aCopyright;
    }

    // Constructor cuando no hay copyright
    public CreativeWork(String aTitle){
        this(aTitle, null);
    }

    // Metodos para recuperar campos de un CreativeWork
    public String getTitle() {
        return title;
    }
    public String getCopyright(){
        return copyright;
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
        //iguales si son exactamente el mismo dato en la memoria
        if (this == otherCW) return true;
        // no son iguales si el otro no es de clase CreativeWork
        if (!(otherCW instanceof CreativeWork)) return false;
        // si nunguno tiene copyright comparamos los titulos
        if (this.copyright==null && ((CreativeWork) otherCW).copyright==null){
            return ((CreativeWork)otherCW).title.equals(this.title);
        }
        // comparamos titulos y copyright
        if (this.copyright!=null && ((CreativeWork) otherCW).copyright!=null){
            return ((CreativeWork)otherCW).title.equals(this.title) &&
                ((CreativeWork)otherCW).copyright.equals(this.copyright);
        }
        // otro caso: no son iguales
        return false;
    }

    // Metodo que revisa si el CW tiene copyright
    public boolean hasCopyright(){
        return this.copyright!=null;
    }
}
