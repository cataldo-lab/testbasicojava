
import java.util.Scanner;


//Valida que un numero sea mayor o igual a 0

//Do while es un buen metodo para hacer validaciones
public class Test10 {
    public static void main(String[] args) {
        int number = 0;
        Scanner sn= new Scanner(System.in);

        do { 
            System.out.println("Introduce un numero: ");
            number=sn.nextInt();

            if(number<0){
                System.out.println("El numero es mayor o igual a 0");
            }
        } while (number<0);

        System.out.println("El numero es: " + number);
    }
}
