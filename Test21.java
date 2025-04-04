public class Test21 {
    
    public static void main(String[] args) {
     
        int[] array= {30,50,20,60,80,90};
        int menor=array[0];
        int mayor=array[0];


        for(int i=1;i<array.length;i++){
            if(array[i]>mayor){
                mayor=array[i];
            }

            if(array[i]<menor){
                menor=array[i];
            }
        }

        System.out.println("El numero menor es: "+ menor);
        System.out.println("El numero mayor es: "+ mayor);

    }
}
