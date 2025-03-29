
import java.util.Scanner;

public class Test5_1 {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n1 = sn.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = sn.nextInt();
        System.out.println("Introduce otro numero");
        int n3 = sn.nextInt();


        if(n1>=n2 && n1>=n3){
            System.out.println("El mayor es: "+n1);
        }else if(n2>=n3){
            System.out.println("El mayor es: "+n2);
        }else {
            System.out.println("El mayor es: "+n3);
        }

        if(n1<=n2 && n1<=n3){
            System.out.println("El menor es: "+n1);
        }else if(n2<=n3){
            System.out.println("El menor es: "+n2);
        }else {
            System.out.println("El menor es: "+n3);
        }

       
    }


}
