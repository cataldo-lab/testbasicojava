/*
 * Dado dos arrays, uno con nombres de personas y otro con sus edades,
 * Indique cual es la persona con mas edad
 */


public class Test22 {
    

    public static void main(String[] args) {
        
        String[] nombres={"Fernando","Manuel","Alfredo"};
        int[] edades ={33,40,18};
        //Se usa el concepto de indice;

        int indiceMayor=0;

        for(int i=1;i<edades.length;i++){
            if(edades[i]>edades[indiceMayor]){
                indiceMayor=i;
            }


        }

        System.out.println("La persona con más edad ("+ edades[indiceMayor] + ") es "+nombres[indiceMayor]);

        
    }

  

  
}
