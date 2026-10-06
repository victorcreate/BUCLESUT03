import java.util.Scanner;

public class ej2while_do {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nivel;
        int numSistemas;
        int problema,revision,corrrecto;

        System.out.println("Cuantos sistemas se van a comprobar?");
        numSistemas = sc.nextInt();
        // BUCLE PARA PEDIR EL ESTADO DE CADA UNO DE LOS SISTEMAS
        // COMO VAMOS A COMPROBAR TODOS LOS SISTEMAS
        // EL BUCLE MAS ADECUADO ES EL FOR
        for (int i = 1; i <= numSistemas; i++) {

            System.out.println("Sistema " + i);
            // RESULTADO
            // aqui tengo que aplicar los valores del enunciado
            System.out.println("Nivel de funcionamiento ");
            nivel = sc.nextInt();
            // no tratamos con valores no previstos, solo valores entre 0 hasta
            if (nivel >=70) {
                System.out.println("El sistema funciona correctamente");
            }






        }

    }

}
