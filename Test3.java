
import java.util.Scanner;

public class Test3 {
    
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sn= new Scanner(System.in);
        int n1=sn.nextInt();
        System.out.println("Introduce otro numero");
        Scanner sn2= new Scanner(System.in);
        int n2=sn2.nextInt();

        if(n1%n2==0){
            System.out.println(n1+" es Divisible por "+n2);
        }else {
            System.out.println("N1 no es divisible por N2");
        }

    }
}
