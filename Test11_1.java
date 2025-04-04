public class Test11_1 {
    
    public static void main(String[] args){
        

        java.util.Scanner sn= new java.util.Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String word=sn.nextLine();
        sn.useDelimiter("\n");
        //Eso es para eliminar los espacios en blanco de la cadena
        int count=0;
        int count2=0;
        for(int i=0;i<word.length();i++){
            
            char c=word.toLowerCase().charAt(i);
            //Convierte en minuscula y se saca character..
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
            }

            if (c != 'a' || c != 'e' || c != 'i' || c == 'o' || c == 'u') {
                //Si no es vocal y no es espacio en blanco
                //Es consonante
                //System.out.println("Es consonante");
            count2++;
            }

            if (c == ' ') {
                //Si es espacio en blanco
                //System.out.println("Es espacio en blanco");
            count2--;
            }


        }
        System.out.println("La cantidad de vocales es: " + count);
        System.out.println("La cantidad de consonantes es: " + (count2-count));
    }
}
