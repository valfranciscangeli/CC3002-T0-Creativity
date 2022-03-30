/**
 * Este ejemplo muestra el funcionamiento del constructor y de los
 * m´etodos equals y toString para comics, deben agregar lo mismo para
 * todas sus clases.
 */

public class Main {
    public static void main(String[] args){
        Creativework trabajo1 = new Creativework("100 años de soledad");
        Creativework trabajo2 = new Creativework("100 años de soledad", "Libres");
        Creativework trabajo3 = new Creativework("La odisea");
        Creativework trabajo4 = new Creativework("100 años de soledad");
        //####################################################
        System.out.println("==============================");
        System.out.println("trabajo1: "+trabajo1);
        System.out.println("trabajo2: "+trabajo2);
        System.out.println("trabajo3: "+trabajo3);
        System.out.println("trabajo4: "+trabajo4);
        System.out.println("los trabajos 1 y 4 son iguales?:"+ trabajo1.equals(trabajo4));
    }
}
