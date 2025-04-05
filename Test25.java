/*
 * 25. Indicar si un elemento existe en un array usando una función.
 */

public class Test25 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elemento = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elemento) {
                System.out.println("El elemento " + elemento + " existe en el array.");
                break;
            }else{
                System.out.println("El elemento " + elemento + " no existe en el array.");
                break;
            }
        }

    }
}
