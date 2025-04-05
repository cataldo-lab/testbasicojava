import java.util.Arrays;

public class Test24 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {9, 8, 7, 6, 5};
        int[] fusion = new int[array.length + array2.length];

        for (int i = 0; i < array.length; i++) {
            fusion[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            fusion[array.length + i] = array2[i];
        }

        // Mostrar el arreglo fusionado
        System.out.println(Arrays.toString(fusion));
    }
}
