/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class EjerClase2610 {

    /**
     * Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades
     * del país, en cada ciudad cuenta con T tiendas y cada tienda tiene E
     * empleados. Cada día una tienda pregunta lo que vende cada empleado de
     * manera individual, para saber cuánto vendió la tienda en total, cuánto se
     * vendió en la ciudad y el total recaudado por la cadena de tiendas en el
     * país. Realiza el programa para introducir en un día lo que vendió cada
     * empleado de cada tienda de cada ciudad y saber las ventas de cada tienda,
     * de cada ciudad y del total en el país
     */
    public static void main(String[] args) {

//        int numeroCiudades = 1;
//        int numeroTiendas = 2;
//        int numeroEmpleados = 3;
//        double sumaEmpleado = 0;
//
//        for (int i = 1; i <= numeroCiudades; i++) {
//            for (int j = 1; j <= numeroTiendas; j++) {
//                System.out.println("Tienda " + j);
//                for (int k = 1; k <= numeroEmpleados; k++) {
//                    System.out.println("¿Cuánto ha vendido el empleado " + k + "?");
//                    sumaEmpleado += teclado.nextDouble();
//                    System.out.println(sumaEmpleado);
//
//                }
//            }
//        }

        int numeroCiudades;
        int numeroTiendasCiudad;
        int numeroEmpleados;
        final String TIENDA_CENTRAL = "Sucursal central";
        double ventaEmpleado;
        double ventaTotalTienda;
        double ventaTotalCiudad;
        double ventaTotalPais = 0;

        //mensaje de bienvenida
        System.out.printf("Bienvenido a %s \n", TIENDA_CENTRAL);
        //preguntamos el número de ciudades con sucursal
        System.out.println("¿En cuántas ciudades hay tiendas?");
        numeroCiudades = pedirNumeroInt();
        //número de tiendas en cada ciudad
        System.out.println("¿Cuántas tiendas hay en cada ciudad? ");
        numeroTiendasCiudad = pedirNumeroInt();
        //número de empleados en cada tienda
        System.out.println("¿Cuántos empleados tiene cada tienda? ");
        numeroEmpleados = pedirNumeroInt();

        //bucle for para recorrer las ciudades
        for (int i = 0; i < numeroCiudades; i++) {
            ventaTotalCiudad = 0;
            System.out.println("ciudad " + (i + 1) + ":");
            //bucle for para recorrer cada tienda
            for (int j = 0; j < numeroTiendasCiudad; j++) {
                ventaTotalTienda = 0;
                System.out.println("tienda " + (j + 1) + ":");
                //bucle for para recorrer cada empleado
                for (int k = 0; k < numeroEmpleados; k++) {
                    ventaEmpleado = 0;
                    System.out.println("¿Cúanto ha vendio en la "
                            + "ciudad " + (i + 1) + " en la tienda " + (j + 1)
                            + " el empleado " + (k + 1) + "?");
                    ventaEmpleado = pedirNumeroDouble();

                    ventaTotalTienda += ventaEmpleado;

                }

                System.out.println("En la tienda " + (j + 1) + " de la ciudad "
                        + (i + 1) + ". Se ha vendido un total de "
                        + ventaTotalTienda + "€");
                System.out.println("\t**");
                ventaTotalCiudad += ventaTotalTienda;

            }

            System.out.println("En la ciudad " + (i + 1) + " se ha vendido un "
                    + "total de " + ventaTotalCiudad + "€");
            System.out.println("\t**");
            ventaTotalPais += ventaTotalCiudad;
        }

        System.out.println("En total se recauda: " + ventaTotalPais + "€");

    }
    
    public static int pedirNumeroInt(){
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean mismatchExcept = false;
        do {
            try {
                System.out.println("Número entre 1-10");
                numero = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Eso no es un número");
                mismatchExcept = true;
            }
            if (!(numero >= 1 && numero <= 10)) {
                System.out.println("Debe ser un número entre 1 y 10");
            }
        } while (!(numero >= 1 && numero <= 10) || mismatchExcept);

        return numero;
    }
    
    public static double pedirNumeroDouble(){
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        boolean mismatchExcept = false;
        do {
            try {
                System.out.println("Número entre 1-10");
                numero = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Eso no es un número");
                mismatchExcept = true;
            }
            if (!(numero >= 1 && numero <= 10)) {
                System.out.println("Debe ser un número entre 1 y 10");
            }
        } while (!(numero >= 1 && numero <= 10) || mismatchExcept);

        return numero;
    }

}
