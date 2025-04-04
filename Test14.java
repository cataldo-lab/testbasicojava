
//Es palindromo

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        System.out.println("Introduce una palabra: ");
        String word = sn.nextLine();

        String word2 = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            word2 += c;
        }

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
      
}
