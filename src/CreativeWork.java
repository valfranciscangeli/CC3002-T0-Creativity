public class CreativeWork {
    //parametros
    String title;
    String copyright = null;

    public CreativeWork(String aTitle){
        this.title = aTitle;
    }

    public CreativeWork(String aTitle, String aCopyright){
        this.title = aTitle;
        this.copyright = aCopyright;
    }

    @Override
    public boolean equals(Object otherCW){
        if (otherCW instanceof CreativeWork){
            if (this.copyright==null && ((CreativeWork) otherCW).copyright==null){
                return ((CreativeWork)otherCW).title.equals(this.title);
            }
            if (this.copyright!=null && ((CreativeWork) otherCW).copyright!=null){
                return ((CreativeWork)otherCW).title.equals(this.title) &&
                    ((CreativeWork)otherCW).copyright.equals(this.copyright);
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
