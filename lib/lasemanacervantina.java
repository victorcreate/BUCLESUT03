/*
Durante la Semana Cervantina se quiere registrar el número de visitantes que acceden a una actividad.

El programa debe pedir el número de visitantes que van entrando, uno a uno.

Mientras el número introducido sea mayor que 0, continuará pidiendo visitantes. Cuando se introduzca 0, terminará el registro. Al finalizar, debe mostrar: El número total de visitantes. El número de grupos registrados.

Ejemplo:

Visitantes del grupo: 25
Visitantes del grupo: 18
Visitantes del grupo: 32
Visitantes del grupo: 12
Visitantes del grupo: 0

Total de visitantes: 87
Número de grupos: 4

*/





package BUCLESUT03.lib;

import java.util.Scanner;

public class lasemanacervantina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int numGrupos = 0;
        int totalvisitantes = 0;
        int visitantes = 0 ;

        System.out.println("Dime los visitantes que van pasando");
        do{
            System.out.println("Visitantes del grupo");
            visitantes = sc.nextInt();
            totalvisitantes += visitantes;
            numGrupos++;





        }while(visitantes !=0);

        System.out.println("Total visitantes: " + totalvisitantes);
        System.out.println("Numero de grupos: " + numGrupos--);

        
        
    }
    
}
