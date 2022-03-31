/**
 * Este ejemplo muestra el funcionamiento del constructor y de los
 * metodos equals y toString para comics, deben agregar lo mismo para
 * todas sus clases.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("CREATIVE WORK TEST==============================");
        CreativeWork trabajo01 = new CreativeWork("Monalisa");
        CreativeWork trabajo02 = new CreativeWork("100 años de soledad", "Libres");
        CreativeWork trabajo03 = new CreativeWork("El padrino");
        CreativeWork trabajo04 = new CreativeWork("Monalisa");
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
        String[] cast3= new String[]{"Jacob Tremblay","Jack Dylan Grazer","Emma Berman"};
        Movie trabajo09  = new Movie("El privilegio","Katharina Schöde", "Eckhard Vollmar", cast1, "Netflix Inc.");
        Movie trabajo10 = new Movie("El privilegio","Katharina Schöde", "Eckhard Vollmar", cast1);
        Movie trabajo11 = new Movie("Red", "Domee Shi", "Julia Cho", cast2 );
        Movie trabajo12 = new Movie("Luca", "Enrico Casarosa", "Jesse Andrews", cast3, "Disney Inc.");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo09: "+trabajo09);
        System.out.println("trabajo10: "+trabajo10);
        System.out.println("trabajo11: "+trabajo11);
        System.out.println("trabajo12: "+trabajo12);
        //####################################################
        System.out.println("NOVEL TEST==============================");
        Novel trabajo13 = new Novel("Malaventura", "Impedimenta", "Fernando Navarro");
        Novel trabajo14 = new Novel("Últimos días en Berlín", "Editorial Planeta", "Paloma Sánchez-Garnica", "© 2022 Planeta");
        Novel trabajo15 = new Novel("La sonata del silencio","Editorial Planeta", "Paloma Sánchez-Garnica", "© 2022 Planeta");
        Novel trabajo16 = new Novel("Por si las voces vuelven", "Editorial Planeta", "Ángel Martín", "© 2022 Planeta");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo13: "+trabajo13);
        System.out.println("trabajo14: "+trabajo14);
        System.out.println("trabajo15: "+trabajo15);
        System.out.println("trabajo16: "+trabajo16);
        //####################################################
        System.out.println("COMIC TEST==============================");
        String[] cartoonists1= new String[]{"Gabriel Bá","Dave Stewart", "Nick Filardi"};
        String[] cartoonists2= new String[]{"Brian Bolland"};
        String[] cartoonists3= new String[]{"Jean-Marc Rochette"};
        String[] cartoonists4= new String[]{"Brian Bolland"};
        Comic trabajo17  = new Comic("The Umbrella Academy", "Dark Horse", "Gerard Way", cartoonists1);
        Comic trabajo18 = new Comic("Batman", "DC Comics", "Bill Finger",cartoonists2, "DC Entertainment");
        Comic trabajo19 = new Comic("Le Transperceneige", "Casterman", "Benjamin Legrand", cartoonists3);
        Comic trabajo20 = new Comic("Batman", "DC Comics", "Bill Finger",cartoonists4, "DC Entertainment");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo17: "+trabajo17);
        System.out.println("trabajo18: "+trabajo18);
        System.out.println("trabajo19: "+trabajo19);
        System.out.println("trabajo20: "+trabajo20);
        //####################################################

        System.out.println("COMPARAMOS IGUALDADES ==============================");

        System.out.println("trabajo01 es igual a trabajo02?: " +  trabajo01.equals(trabajo02));
        System.out.println("trabajo02 es igual a trabajo01?: " +  trabajo02.equals(trabajo01));
        System.out.println("trabajo03 es igual a trabajo03?: " +  trabajo03.equals(trabajo03));
        System.out.println("trabajo01 es igual a trabajo04?: " +  trabajo01.equals(trabajo04));

        System.out.println("==============================");

        System.out.println("trabajo05 es igual a trabajo06?: " +  trabajo05.equals(trabajo06));
        System.out.println("trabajo06 es igual a trabajo05?: " +  trabajo06.equals(trabajo05));
        System.out.println("trabajo07 es igual a trabajo07?: " +  trabajo07.equals(trabajo07));
        System.out.println("trabajo05 es igual a trabajo08?: " +  trabajo05.equals(trabajo08));

        System.out.println("==============================");

        System.out.println("trabajo09 es igual a trabajo10?: " +  trabajo09.equals(trabajo10));
        System.out.println("trabajo10 es igual a trabajo09?: " +  trabajo10.equals(trabajo09));
        System.out.println("trabajo11 es igual a trabajo11?: " +  trabajo11.equals(trabajo11));
        System.out.println("trabajo09 es igual a trabajo12?: " +  trabajo09.equals(trabajo12));

        System.out.println("==============================");

        System.out.println("trabajo13 es igual a trabajo14?: " +  trabajo13.equals(trabajo14));
        System.out.println("trabajo14 es igual a trabajo13?: " +  trabajo14.equals(trabajo13));
        System.out.println("trabajo15 es igual a trabajo15?: " +  trabajo15.equals(trabajo15));
        System.out.println("trabajo13 es igual a trabajo16?: " +  trabajo13.equals(trabajo16));

        System.out.println("==============================");

        System.out.println("trabajo17 es igual a trabajo18?: " +  trabajo17.equals(trabajo18));
        System.out.println("trabajo18 es igual a trabajo17?: " +  trabajo18.equals(trabajo17));
        System.out.println("trabajo19 es igual a trabajo19?: " +  trabajo19.equals(trabajo19));
        System.out.println("trabajo18 es igual a trabajo20?: " +  trabajo18.equals(trabajo20));

        System.out.println("==============================");
        
        System.out.println("trabajo03 es igual a trabajo10?: " +  trabajo03.equals(trabajo10));
        System.out.println("trabajo08 es igual a trabajo19?: " +  trabajo08.equals(trabajo19));
        System.out.println("trabajo09 es igual a trabajo09?: " +  trabajo09.equals(trabajo09));
        System.out.println("trabajo04 es igual a trabajo10?: " +  trabajo04.equals(trabajo10));
        System.out.println("trabajo20 es igual a trabajo18?: " +  trabajo20.equals(trabajo18));
        System.out.println("trabajo02 es igual a trabajo12?: " +  trabajo02.equals(trabajo12));
        System.out.println("trabajo09 es igual a trabajo09?: " +  trabajo09.equals(trabajo09));
        System.out.println("trabajo01 es igual a trabajo20?: " +  trabajo01.equals(trabajo20));

        //####################################################

        System.out.println(" Revisamos si tienen copyright ==============================");
        System.out.println("trabajo01 tiene copyright?:"+ trabajo01.hasCopyright());
        System.out.println("trabajo08 tiene copyright?:"+ trabajo08.hasCopyright());
        System.out.println("trabajo10 tiene copyright?:"+ trabajo10.hasCopyright());
        System.out.println("trabajo07 tiene copyright?:"+ trabajo07.hasCopyright());
        System.out.println("trabajo18 tiene copyright?:"+ trabajo18.hasCopyright());
        System.out.println("trabajo13 tiene copyright?:"+ trabajo13.hasCopyright());


    }
}
