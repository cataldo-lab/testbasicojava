
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test19 {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(1);

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        int n;

        do { 
            System.out.println("Introduce un numero maximo de operaciones fibonacci: ");
            n = sn.nextInt();
        } while(n<3 || n>25);

        fibonacci(n, lista);



        

    }

    public static void fibonacci(int n, List<Integer> lista) {
        
    

        for (int i = 2; i < n; i++) {
            int num = lista.get(i - 1) + lista.get(i - 2);
            //permite acceder a los campos de la clase
            lista.add(num);
        
        }
        


        for (int num : lista) {
            System.out.println(num);
        }
    }
}

