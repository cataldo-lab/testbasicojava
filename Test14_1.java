import java.util.Scanner;

public class Test14_1 {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una frase: ");
        String word = sn.nextLine();
        String word2 = "";

        char caracter;

        for(int i = word.length() - 1; i >= 0; i--){
            caracter = word.charAt(i);
            word2 += caracter;
        }

        if(word.equalsIgnoreCase(word2)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        sn.close();

        
    }
}
