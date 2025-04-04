
//Crear un arrray y sumar sus elementos.

public class Test20 {
    
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int suma=0;
        for(int i=0; i<array.length;i++){
            suma+=array[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
        
        double media= (double)suma/array.length;
        //(double) es para que no haga la division entera
        System.out.println("La media de los elementos del array es: " + media);
    }
}
