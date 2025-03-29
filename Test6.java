
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sn.nextInt();
        System.out.print("Enter a number");
        int number2 = sn.nextInt();

        


        System.out.println("La suma es: " + sumar(number, number2));
        System.out.println("La resta es: " + restar(number, number2));
        System.out.println("La multiplicacion es: " + multiplicar(number, number2));
        System.out.println("La division es: " + dividir(number, number2));
    }


    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede hacer división entre cero");
            //Excion logica
        }else if (a == 0) {
            return 0;
        }
        return a / b;
    }
}
