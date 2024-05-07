import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ingreso registro de edad persona 1.
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        String fecha1 = sc.next();

        //conversion de string a int
        String dia1 = fecha1.substring(0, 2);
        int diaEntero1 = Integer.parseInt(dia1);
        String mes1 = fecha1.substring(3, 5);
        int mesEntero1 = Integer.parseInt(mes1);
        String anio1 = fecha1.substring(6, 10);
        int anioEntero1 = Integer.parseInt(anio1);

        //Calculo de edad persona 1 convertidos a dias
        double anios1;
        anios1 =((2024*365)-((diaEntero1)+(mesEntero1*30.417)+(anioEntero1*365)));

        //Ingreso registro de edad persona 2.
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
        String fecha2 = sc.next();

        //conversion de string a int
        String dia2 = fecha2.substring(0, 2);
        int diaEntero2 = Integer.parseInt(dia2);
        String mes2 = fecha2.substring(3, 5);
        int mesEntero2 = Integer.parseInt(mes2);
        String anio2 = fecha2.substring(6, 10);
        int anioEntero2 = Integer.parseInt(anio2);

        //Calculo de edad persona 2 convertidos a dias
        double anios2;
        anios2 =((2024*365)-((diaEntero2)+(mesEntero2*30.417)+(anioEntero2*365)));

        //Condiciones
        if (anios1 > anios2) {
            System.out.println("Persona 1 es mayor");
        }
        if (anios1 < anios2) {
             System.out.println("Persona 2 es mayor");
        }
        if (anios1 == anios2) {
            System.out.println("Tienen la misma edad");

            //fin programa
        }

    }
}
