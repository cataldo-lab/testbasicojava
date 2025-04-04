
import java.util.Scanner;

public class Test12_1 {
// Es otro tema
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una frase: ");
        String frase =sn.nextLine();

        int contadorMayusculas=0;
        int contadorMinusculas=0;

        char caracter;

        for(int i =0;i<frase.length();i++){
            caracter=frase.charAt(i);

            if(caracter>='A' && caracter<='Z'){
                contadorMayusculas++;
            }else if(caracter>='a' && caracter<='z'){
                contadorMinusculas++;
            }
        }

        System.out.println("La cantidad de mayusculas es: " + contadorMayusculas);
        System.out.println("La cantidad de minusculas es: " + contadorMinusculas);
    }

    
}
