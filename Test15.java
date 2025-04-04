import java.util.Random;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        int num;
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100

        int count = 5;

        do { 
            do { 
                System.out.println("Introduce un numero entre 1 y 100: ");
                num = sn.nextInt();
            } while (num < 1 || num > 100);

            if (randomNum == num) {
                System.out.println("Has acertado el numero");
                
                break; // 🔧 este break detiene el juego si aciertas
            } else if (randomNum < num) {
                System.out.println("El numero es menor");
                count--;
                System.out.println("Te quedan " + count + " intentos\n");
                continue; // 🔧 este continue hace que el bucle vuelva a empezar
            } else if (randomNum > num) {
                System.out.println("El numero es mayor");
                System.out.println("Te quedan " + count + " intentos\n"); 
                count--;
                continue;
            }

        } while (count > 0);

        if (count == 0) {
            System.out.println("Has perdido, el numero era: " + randomNum);
        }
    }
}
