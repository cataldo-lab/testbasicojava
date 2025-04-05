/*
 * Crea un array que vea si es capicua
 */

public class Test23 {
    
    public static void main(String[] args) {
        
        int[] numeros={1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,2};
        boolean capicua=true;
        int[] inversonumeros= new int[numeros.length];
        //int[] inversonumeros= new int[numeros.length];

        for(int i=0;i<numeros.length;i++){
            inversonumeros[i]=numeros[numeros.length-1-i];
        }

        for(int i=0;i<numeros.length;i++){
            capicua = numeros[i] == inversonumeros[i];
        }

        if(capicua==true){
            System.out.println("El array es capicua");
        }else{
            System.out.println("El array no es capicua");
        }



    }
}
