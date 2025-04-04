//Funcion para generar un password
import java.util.Random;
import java.util.Scanner;

public class Test18 {
    
    public static void main(String[] args) {
        

        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        int longitud;
        

        do { 
            System.out.println("Introduce la longitud de la contraseña: ");
            longitud = sn.nextInt();
        } while (longitud < 8 || longitud > 23);

        String password = generarPass(longitud);
        System.out.println("La contraseña generada es: " + password);

        
    }

    public static String generarPass(int longitud){
        String password = "";
        for (int i = 0; i < longitud; i++) {
            int aleatorio = aleatorio();
            char c = (char) aleatorio;
            password += c;
        }
        return password;
    }

    public static int aleatorio(){
        int min =33;
        int max = 126;
        Random random = new Random();
        int aleatorio = random.nextInt(max - min + 1) + min;
        return aleatorio;
    }
}



