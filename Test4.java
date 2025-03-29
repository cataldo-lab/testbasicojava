
import java.util.Scanner;

//Pide un año por teclado e indica si es biciesto o no
//Dicisible por 4 y no divisible por 100
// o divisible por 400


public class Test4 {
    public static void main(String[] args) {
        System.out.println("Introduce un año");
        Scanner sn=new Scanner(System.in);
        int año=sn.nextInt();
        if(año%4==0 && año%100!=0 || año%400==0){
            System.out.println("El año "+año+" es biciesto");
        }else {
            System.out.println("El año "+año+" no es biciesto");
        }
    }
}
