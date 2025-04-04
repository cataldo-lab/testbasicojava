
import java.util.Scanner;

/*
 * Pide una frase por teclado y cuenta cuantas
 * mayusculas y minusculas hay
 */


public class Test12 {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una frase: ");
        String frase =sn.nextLine();

        int contadorMayusculas=0;
        int contadorMinusculas=0;
        for (int i=0;i<frase.length();i++){
            char c=frase.charAt(i);
            //Esto es un caracter para recorrer la cadena
            //y ver si es mayuscula o minuscula
            if (Character.isUpperCase(c)){
                contadorMayusculas++;
            }else if (Character.isLowerCase(c)){
                contadorMinusculas++;
            }
        }
        System.out.println("La cantidad de mayusculas es: " + contadorMayusculas);
        System.out.println("La cantidad de minusculas es: " + contadorMinusculas);


    }
    
}
