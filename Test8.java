// Java program to print numbers from 1 to 100 that are divisible by both 2 and 3   

public class Test8 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0 && i%3 == 0) {
                System.out.println(i+ " Es divisible entre 2 y 3");
            } 

        }
    }
}
