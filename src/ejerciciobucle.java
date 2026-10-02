import java.util.Scanner;

public class ejerciciobucle {

    public static void main(String[] args) {
        // PEDIMOS AL USUARIO 5 NUMEROS
        // MOSTRAMOS EL NUMERO MAYOR
        // USANDO BUCLE

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, numero5;
        int numeroMayor;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            numero1 = sc.nextInt();
            if (numero1 > numeroMayor) {
                numeroMayor = numero1;

            }
        }

    }

}
