public class ejemplo_do_while {
    public static void main(String[] args) {
        
        //CUENTA ATRAS DESDE 10
        final int MAX = 10;

        //HASTA CERO
        final int MIN =0;

        //USO FOR PARA HACER LA CUENTA ATRAS

        for(int i= MAX; i>=0; i--){
            System.out.println(i + " - quedan " +("para el lanzamiento"));
            if(i<=5){
                System.out.println("ya no hay vuelta atras");

            }
            System.out.println("ya no hay vuelta atras");
        }
        System.out.println("!Lanzamiento!");


        /**
         * Alternativa
         * 
         */

        int contador =MAX;
        //SE REPTITE HASYA QUE LLEGUE AL 0
        System.out.println(contador + " - quedan"+ (contador-1) +"para el lanzamiento");
        if (contador<=5) {
            System.out.println("ya no hay vuelta atras");
            
        }
        contador --;



    }
    
}
