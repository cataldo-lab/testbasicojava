import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        int num;
        int inicial;


        do { 
            System.out.println("Introduce un numero: ");
            num = sn.nextInt();
        } while (num<0 || num>100);
        inicial=num;
        int clone=num;

        for(int i=num; i>0; i--){
            clone--;
            num=num*clone;
            if(clone==1){
                break;
        }

    }
        if(num==0){
            num=1;
        }
        System.out.println("El factorial de " + inicial + " es: " + num);
        sn.close();
    }
}
