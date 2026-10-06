import java.util.Scanner;

public class ejemplos_while {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         int opcion =2;

         do{
            System.out.println("0. Muestra sigue");
            System.out.println("1. Salir");
            opcion = sc.nextInt();

         }while(opcion !=1);
         System.out.println("fin");
         
    }

    
}