
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una frase: ");
        String frase = sn.nextLine();

        String fraseSinEspacios="";

        char caracter;
        for (int i =0; i<frase.length(); i++){
            caracter =frase.charAt(i);
            if (caracter != ' '){
                fraseSinEspacios += caracter;
            }
        }

        System.out.println("La frase sin espacios es: " + fraseSinEspacios);
        System.out.println("La longitud de la frase sin espacios es: " + fraseSinEspacios.length());
    }
}
