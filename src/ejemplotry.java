import java.util.Scanner;

public class ejemplotry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continua = true;
        System.out.println("Numero entero");
        while (continua) {
            try {
                int numero = sc.nextInt();
                continua = false;
            } catch (Exception e) {
                System.out.println("EL NUMERO NO ES CORRECTO");
                sc.nextLine();
                // finally{
                //}
            }
            
        }
        System.out.println("CONTINUA");

    }
    
}
