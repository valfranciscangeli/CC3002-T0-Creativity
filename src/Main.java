/**
 * Este ejemplo muestra el funcionamiento del constructor y de los
 * m´etodos equals y toString para comics, deben agregar lo mismo para
 * todas sus clases.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("CREATIVE WORK TEST==============================");
        CreativeWork trabajo01 = new CreativeWork("Monalissa");
        CreativeWork trabajo02 = new CreativeWork("100 años de soledad", "Libres");
        CreativeWork trabajo03 = new CreativeWork("El padrino");
        CreativeWork trabajo04 = new CreativeWork("Monalissa");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo01: "+trabajo01);
        System.out.println("trabajo02: "+trabajo02);
        System.out.println("trabajo03: "+trabajo03);
        System.out.println("trabajo04: "+trabajo04);
        //System.out.println("los trabajos 1 y 4 son iguales?:"+ trabajo01.equals(trabajo04));
        //####################################################
        System.out.println("LITERARY WORK TEST==============================");
        LiteraryWork trabajo05 = new LiteraryWork("El juego de Ripper","Sudamericana", "Derechos Reservados");
        LiteraryWork trabajo06 = new LiteraryWork("El juego de Ripper","Sudamericana");
        LiteraryWork trabajo07 = new LiteraryWork("El juego de Ripper","Sudamericana", "Derechos Reservados");
        LiteraryWork trabajo08 = new LiteraryWork("Yo antes de ti", "DeBolsillo");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo05: "+trabajo05);
        System.out.println("trabajo06: "+trabajo06);
        System.out.println("trabajo07: "+trabajo07);
        System.out.println("trabajo08: "+trabajo08);
        //####################################################
        System.out.println("MOVIE TEST==============================");
        String[] cast1= new String[]{"Max Schimmelpfennig","Lea van Acken", "Tijan Marei"};
        String[] cast2= new String[]{"Rosalie Chiang","Sandra Oh","Ava Morse"};
        String[] cast3= new String[]{};
        Movie trabajo09  = new Movie("El privilegio","Katharina Schöde", "Eckhard Vollmar", cast1, "Netflix Inc.");
        Movie trabajo10 = new Movie("El privilegio","Katharina Schöde", "Eckhard Vollmar", cast1);
        Movie trabajo11 = new Movie("Red", "Domee Shi", "Julia Cho", cast2 );
        Movie trabajo12 = new Movie();
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo09: "+trabajo09);
        System.out.println("trabajo10: "+trabajo10);
        System.out.println("trabajo11: "+trabajo11);
        System.out.println("trabajo12: "+trabajo12);
        //####################################################
        System.out.println("NOVEL TEST==============================");
        Novel trabajo13  = new Novel();
        Novel trabajo14 = new Novel();
        Novel trabajo15 = new Novel();
        Novel trabajo16 = new Novel();
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo13: "+trabajo13);
        System.out.println("trabajo14: "+trabajo14);
        System.out.println("trabajo15: "+trabajo15);
        System.out.println("trabajo16: "+trabajo16);
        //####################################################
        System.out.println("COMIC TEST==============================");
        Comic trabajo17  = new Comic();
        Comic trabajo18 = new Comic();
        Comic trabajo19 = new Comic();
        Comic trabajo20 = new Comic();
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo17: "+trabajo17);
        System.out.println("trabajo18: "+trabajo18);
        System.out.println("trabajo19: "+trabajo19);
        System.out.println("trabajo20: "+trabajo20);
        //####################################################
    }
}
