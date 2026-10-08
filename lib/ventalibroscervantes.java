package BUCLESUT03.lib;

import java.util.Scanner;

public class ventalibroscervantes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int librosvendidos = 0;
        double preciomedio;
        double recaudaciontotal = 0;
        double precio;

        do{
        System.out.println("Dime el precio de cada libro vendido");
        precio = Double.parseDouble(sc.nextLine());
        recaudaciontotal=recaudaciontotal + precio;

        librosvendidos = librosvendidos +1;
        }while(precio !=0);

        System.out.println("Recaudacion "+ recaudaciontotal);
        System.out.println("Libros vendidos" + librosvendidos);
        preciomedio = (recaudaciontotal / librosvendidos);
        System.out.println("Promedio del precio "+ preciomedio);
    }
    
}
