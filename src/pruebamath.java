public class pruebamath {
    public static void main(String[] args) {



        double aleatorio = Math.random();
        int miAleatorio = (int)(aleatorio *10);
        System.out.println(aleatorio);
        for(int i =0; i < 5; i++) {
            aleatorio = Math.random();
            miAleatorio= (int) (aleatorio *10);
            System.out.println(aleatorio);
            System.out.println(miAleatorio);
        }
        


    }
    
}
