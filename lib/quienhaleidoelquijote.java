package BUCLESUT03.lib;

import java.util.Scanner;

public class quienhaleidoelquijote {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         String respuesta ;
         int numpersonasleen = 0;
         int numpersonasencuestadas = 0;
         int porcentaje;
         boolean continua = true;

         while (continua) {

            System.out.println("Has leido alguna obra de Cervantes");
            respuesta = sc.nextLine();

            switch (respuesta) {
                case "s":
                    numpersonasencuestadas++;
                    numpersonasleen++;
                    break;
                case "n":
                numpersonasencuestadas++;
            
                default:
                    continua = false;
                    break;
            }

         }
   
System.out.println("Personas encuestadas" + numpersonasencuestadas);
System.out.println("Personas que leen" + numpersonasleen);
System.out.println("Porcentaje:" + ( (double)numpersonasleen/ numpersonasencuestadas *100) + "%");


         }



}
