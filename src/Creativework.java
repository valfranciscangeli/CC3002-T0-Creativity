public class Creativework {
    //parametros
    String title;
    String copyright = null;

    public Creativework(String aTitle){
        this.title = aTitle;
    }

    public Creativework(String aTitle, String aCopyright){
        this.title = aTitle;
        this.copyright = aCopyright;
    }

    @Override
    public boolean equals(Object otherCW){
        if (otherCW instanceof Creativework){
            if (this.copyright==null && ((Creativework) otherCW).copyright==null){
                return ((Creativework)otherCW).title.equals(this.title);
            }
            if (this.copyright!=null && ((Creativework) otherCW).copyright!=null){
                return ((Creativework)otherCW).title.equals(this.title) &&
                    ((Creativework)otherCW).copyright.equals(this.copyright);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Creativework{" +
                "title='" + title + '\'' +
                ", copyright='" + copyright + '\'' +
                '}';
    }

    public boolean hasCopyright(){
        return true;
    }
}
