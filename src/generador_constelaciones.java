import java.util.Scanner;

public class generador_constelaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String linea = "";
        String estrella = "*";
        String espacio = " "; 

        int numEspacios;
        int lineasConstelacion;
        System.out.println("Cuantas lineas quiere que tenga la constelacion");

        lineasConstelacion = sc.nextInt();

        for (int i = 0; i < lineasConstelacion; i++) {
            linea = " ";

            numEspacios = (int) (Math.random() * 10);
            for (int j = 0; j < numEspacios; j++) {
                linea = linea + espacio;
            }
            linea = linea + estrella;
            numEspacios = (int) (Math.random() * 10);
            for (int j = 0; j < numEspacios; j++) {
                linea = linea + espacio;
            }
            linea = linea + estrella;
            System.out.println((linea));
        }

    }

}
