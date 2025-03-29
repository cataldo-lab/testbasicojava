import java.util.Scanner;

public class Test7 {
    
    public static void main(String[] args) {
    
        Scanner sn= new Scanner(System.in);
        int number =0;
        int suma=0;
        while(number!=-1){
            System.out.println("Introduce un numero: ");
            number = sn.nextInt();
            suma=suma+number;
            if (number == -1) {
                System.out.println("Fin del programa");
                System.out.println("La suma es: " + suma);
                break;
            }
        }
        

    }

}

