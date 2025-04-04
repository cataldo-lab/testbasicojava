import java.util.Random;

public class Test17 {
    
    public static void main(String[] args) {
        

        int aleatorio;
        for (int i = 0; i < 10; i++) {
            aleatorio = generarAleatorio(1, 10);
            System.out.println("El numero aleatorio es: " + aleatorio);
        }
        
    }

    public static int generarAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;

    }
}
