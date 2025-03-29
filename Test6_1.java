
import java.util.Locale;
import java.util.Scanner;

public class Test6_1 {
    
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        sn.useLocale(Locale.US);
        sn.useDelimiter("\n");

        System.out.println("Introduce el operando 1");
        double operando1 = sn.nextDouble();
        
        System.out.println("Introduce el operador");
        String operador = sn.next();

        System.out.println("Introduce el operando 2");
        double operando2 = sn.nextDouble();

        double resultado=0;

       switch (operador){
            case "+":
                resultado = sumar(operando1, operando2);
                System.out.println("La suma es: " + resultado);
                break;
            case "-":
                resultado= restar(operando1, operando2);
                System.out.println("La resta es: " + resultado);
                break;
            case "*":
                resultado= multiplicar(operando1, operando2);
                System.out.println("La multiplicacion es: " + resultado);
                break;
            case "/":
                resultado= dividir(operando1, operando2);
                System.out.println("La division es: " + resultado);
                break;
            default:
                System.out.println("Operador no valido");
        }
       }

     public static double sumar(double a, double b) {
        return a + b;

    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede hacer división entre cero");
            //Excion logica
        }else if (a == 0) {
            return 0;
        }
        return a / b;
    }

}

//Se puede hacer con esta logica una calculadora basica.
//Añadir grafica