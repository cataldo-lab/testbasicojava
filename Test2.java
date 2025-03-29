

import java.util.Locale;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        sn.useLocale(Locale.US);
        //Scanner pueda leer decimales con punto como en US
        final double IVA =1.21;
        System.out.println("Introduce el precio del producto");
        double precio= sn.nextDouble();
        double precioFinal= precio*IVA;
        System.out.println("El precio con IVA es: " + precioFinal);

        // Version pormateada para que solo se pueda ver 2 decimanles
        System.out.printf("El precio Final es: %.2f%n", precioFinal);

        
    }
}
