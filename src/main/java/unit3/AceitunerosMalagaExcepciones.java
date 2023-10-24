/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AceitunerosMalagaExcepciones {

    public static void main(String[] args) {

        final double PRECIO_INICIAL = 2.43;
        final double PICUAL_GRUESA = 0.20;
        final double PICUAL_FINA = 0.30;
        final double ALORENYA_FINA = 0.30;
        final double ALORENYA_GRUESA = 0.15;
        final double HOJIBLANCA_FINA = 0.05;
        final double HOJIBLANCA_GRUESA = 0.15;
        int opcionTipo = 0;
        int opcionVariedad = 0;
        double cantidadKg = 0;
        String nuevoCliente = "";
        boolean errorMissmatch = false;

        Scanner teclado = new Scanner(System.in);

        do {
            do {
                try {

                    do {
                        System.out.println("""
                           
                                ESCOGE UN TIPO DE ACEITUNA
                           -----------------------------------
                           
                                1 - Picual
                                2 - Aloreña
                                3 - Hojiblanca
                           
                           -----------------------------------
                           """);

                        opcionTipo = teclado.nextInt();
                        
                        if (opcionTipo < 1 || opcionTipo > 3) {
                            System.out.println("NO VALE, introduce un número del 1-3");
                        }
                        
                    } while (opcionTipo < 1 || opcionTipo > 3);

                    do {
                        System.out.println("""
                           
                                     ESCOGE VARIEDAD
                           -----------------------------------
                           
                                1 - Fina
                                2 - Gruesa
                           
                           -----------------------------------
                           """);
                        
                        opcionVariedad = teclado.nextInt();
                        
                        if (opcionVariedad < 1 || opcionVariedad > 2) {
                            System.out.println("NO VALE, introduce el número 1 o 2");
                        }
                        
                    } while (opcionVariedad < 1 || opcionVariedad > 2);

                    System.out.println("Introduce la cantidad en la almazara (kg)");
                    cantidadKg = teclado.nextDouble();

                } catch (InputMismatchException ime) {
                    teclado.nextLine();
                    System.out.println("Eso no es un NÚMERO");
                    errorMissmatch = true;
                }
            } while (errorMissmatch);

            switch (opcionTipo) {
                case 1 -> {

                    if (opcionVariedad == 1) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) + (cantidadKg * PICUAL_FINA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo PICUAL variedad FINA", ganancia);
                    } else if (opcionVariedad == 2) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) + (cantidadKg * PICUAL_GRUESA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo PICUAL variedad GRUESA", ganancia);
                    } else {
                        System.out.println("Introduzca un número que esté en la lista");
                    }
                }
                case 2 -> {

                    if (opcionVariedad == 1) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) - (cantidadKg * ALORENYA_FINA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo ALOREÑA variedad FINA", ganancia);
                    } else if (opcionVariedad == 2) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) - (cantidadKg * ALORENYA_GRUESA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo ALOREÑA variedad GRUESA", ganancia);
                    } else {
                        System.out.println("Introduzca un número que esté en la lista");
                    }
                }
                case 3 -> {

                    if (opcionVariedad == 1) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) - (cantidadKg * HOJIBLANCA_FINA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo HOJIBLANCA variedad FINA", ganancia);
                    } else if (opcionVariedad == 2) {
                        double ganancia = (cantidadKg * PRECIO_INICIAL) + (cantidadKg * HOJIBLANCA_GRUESA);
                        System.out.printf("Ha ganado %.2f por la venta de sus "
                                + "aceitunas tipo HOJIBLANCA variedad GRUESA", ganancia);
                    } else {
                        System.out.println("Introduzca un número que esté en la lista");
                    }
                }
                default -> {
                    System.out.println("Introduzca un número que esté en la lista");
                }
            }

            System.out.println("\n ¿Nuevo cliente? S o N");
            teclado.nextLine();
            nuevoCliente = teclado.nextLine();

        } while (nuevoCliente.equalsIgnoreCase("s"));

    }
}
