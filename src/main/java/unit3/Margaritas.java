/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class Margaritas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nuevaPartida;

        do {
            int numMargaritas = numeroMargaritas();

            for (int i = 1; i <= numMargaritas; i++) {
                System.out.println("¿Cuántos pétalos tiene la margarita Nº" + i + "?");
                int petalosMargarita = teclado.nextInt();
                int tiradaDado = tiradaDado();
                boolean empiezaPor = empiezaPor(tiradaDado);

                if (empiezaPor) {
                    if (petalosMargarita % 2 == 0) {
                        System.out.println("La margarita tiene " + petalosMargarita
                                + " hojas, Romeo sacó " + tiradaDado
                                + " en el dado, empezó a quitar hojas con <<me quiere>>"
                                + " y el resultado final es que su amada no le quiere D:");
                    } else {
                        System.out.println("La margarita tiene " + petalosMargarita
                                + " hojas, Romeo sacó " + tiradaDado
                                + " en el dado, empezó a quitar hojas con <<me quiere>>"
                                + " y el resultado final es que su amada le quiere :D ");
                    }
                } else {
                    if (petalosMargarita % 2 == 0) {
                        System.out.println("La margarita tiene " + petalosMargarita
                                + " hojas, Romeo sacó " + tiradaDado
                                + " en el dado, empezó a quitar hojas con <<no me quiere>>"
                                + " y el resultado final es que su amada le quiere :D ");
                    } else {
                        System.out.println("La margarita tiene " + petalosMargarita
                                + " hojas, Romeo sacó " + tiradaDado
                                + " en el dado, empezó a quitar hojas con <<no me quiere>>"
                                + " y el resultado final es que su amada no le quiere D:");
                    }
                }
            }

            do {
                System.out.println("¿Otra partida? Escribe: Si o No");
                teclado.nextLine();
                nuevaPartida = teclado.nextLine();    
            } while (!(nuevaPartida.equalsIgnoreCase("si")
                    || nuevaPartida.equalsIgnoreCase("no")));

            if (!(nuevaPartida.equalsIgnoreCase("si")
                    || nuevaPartida.equalsIgnoreCase("no"))) {
                System.out.println("Debe escribir SI o NO");
            }
        } while (nuevaPartida.equalsIgnoreCase("si"));

    }

    public static int tiradaDado() {
        final int MAL_FARIO = 3;
        Random random = new Random();
        int randomDado;
        do {
            randomDado = random.nextInt(1, 7);
        } while (randomDado == MAL_FARIO);
        return randomDado;
    }

    public static int numeroMargaritas() {
        Scanner teclado = new Scanner(System.in);
        int numMargaritas = 0;
        boolean mismatchExcept = false;
        do {
            try {
                System.out.println("¿Cuántas margaritas vas a deshojar? (Entre 1 y 10)");
                numMargaritas = teclado.nextInt();
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Eso no es un número");
                mismatchExcept = true;
            }
            if (!(numMargaritas >= 1 && numMargaritas <= 10)) {
                System.out.println("Debe ser un número entre 1 y 10");
            }
        } while (!(numMargaritas >= 1 && numMargaritas <= 10) || mismatchExcept);

        return numMargaritas;
    }

    public static boolean empiezaPor(int numDado) {
        return (numDado % 2 == 0) ? true : false;
    }

}
