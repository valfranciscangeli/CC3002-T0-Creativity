/**
 * Este ejemplo muestra el funcionamiento del constructor y de los
 * m´etodos equals y toString para comics, deben agregar lo mismo para
 * todas sus clases.
 */

public class Main {
    public static void main(String[] args){
        CreativeWork trabajo1 = new CreativeWork("100 años de soledad");
        CreativeWork trabajo2 = new CreativeWork("100 años de soledad", "Libres");
        CreativeWork trabajo3 = new CreativeWork("La odisea");
        CreativeWork trabajo4 = new CreativeWork("100 años de soledad");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo1: "+trabajo1);
        System.out.println("trabajo2: "+trabajo2);
        System.out.println("trabajo3: "+trabajo3);
        System.out.println("trabajo4: "+trabajo4);
        System.out.println("los trabajos 1 y 4 son iguales?:"+ trabajo1.equals(trabajo4));
        //####################################################

        System.out.println("==============================");


    }
}
