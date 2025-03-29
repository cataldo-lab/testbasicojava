import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n1 = sn.nextInt();
        System.out.println("Introduce otro número:");
        int n2 = sn.nextInt();
        System.out.println("Introduce otro número:");
        int n3 = sn.nextInt();

        int[] numeros = {n1, n2, n3};

        // Ordenar los números
        // Arrays.sort() ordena el array en orden ascendente
        // Por lo que el primer elemento será el menor y el último el mayor
        // El segundo elemento será el medio
        // Si los números son iguales, el orden no cambia
        // pero el resultado será el mismo
        // Si los números son iguales, el orden no cambia
        // pero el resultado será el mismo
        Arrays.sort(numeros);

        //Lo ordena de menor a mayor

        int menor = numeros[0];
        int medio = numeros[1];
        int mayor = numeros[2];

        if (n1 == n2 && n1 == n3) {
            System.out.println("Los tres números son iguales");
        }

        System.out.println("El menor es: " + menor);
        System.out.println("El medio es: " + medio);
        System.out.println("El mayor es: " + mayor);
    }
}



//Idea hacer resumen de todos los metodos Array