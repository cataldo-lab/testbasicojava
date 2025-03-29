import java.util.Scanner;

public class Test1{

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        //Es para los espacios de las cadenas, consejo practico
        sn.useDelimiter("\n");
        System.out.println("Introduce un nombre");
        String nombre= sn.next();

        System.out.println("Hola "+ nombre + " bienvenido a la aplicacion");
    }
}