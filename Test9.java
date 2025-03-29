
import java.util.Scanner;

public class Test9 {
    
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner sn= new Scanner(System.in);
        int number =sn.nextInt();

        for(int i=1; i<=10; i++){
            //System.out.println(number + " * "+ i+ " = "+number*i );

            //Resultado Formateado
            System.out.printf("Resultado: %d * %d = %d%n", number, i, number*i);

        }
    }
}
