/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class EjerClase20102 {

    /**
     * En BurgerCrangeBurger están de promoción durante el fin de semana. A cada
     * cliente que se acerque a la caja a pagar su pedido de comida basura le
     * van a descontar unos euros para que pueda dedicarlos en ir al dentista.
     * Cada vez que un cliente se acerca a la caja, este debe tirar un dado. Si
     * la tirada es par, le descuentan un 25% del total del pedido y si la
     * tirada es impar, entonces debe sacar una bolita de color de un saco. Si
     * la bolita es blanca, no hay descuento, si es roja le quitan un 12%, y si
     * es amarilla un 5%. Solicita al cliente que va a pagar el importe del
     * pedido y muestra el descuento, la tirada del dado y el color de la
     * bolita, si es que tuvo que sacarla. Se debe preguntar si hay más
     * clientes, para proceder de igual forma.
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        final double DESCUENTO_PAR = 0.25;
        final double BOLA_ROJA = 0.12;
        final double BOLA_MARILLA = 0.05;
        double precioInicial;
        double precioFinal = 0;
        int numDado;
        String nuevoCliente;

        do {

            System.out.println("Introduzca el importe de su pedido");
            precioInicial = teclado.nextDouble();

            numDado = random.nextInt(1, 7);
            System.out.println("En el dado ha salido: " + numDado);

            if (numDado % 2 == 0) {
                System.out.println("El descuento es del 25%");
                precioFinal = precioInicial - (precioInicial * DESCUENTO_PAR);
            } else {
                int aleatorioBolita = random.nextInt(1, 4);

                switch (aleatorioBolita) {
                    case 1 -> {
                        System.out.println("Ha salido el BLANCO, no hay descuento");
                        precioFinal = precioInicial;
                    }
                    case 2 -> {
                        System.out.println("Ha salido el ROJO, el descuento es del 12%");
                        precioFinal = precioInicial - (precioInicial * BOLA_ROJA);
                    }
                    case 3 -> {
                        System.out.println("Ha salido el AMARILLO, el descuento es del 5%");
                        precioFinal = precioInicial - (precioInicial * BOLA_MARILLA);
                    }
                }

            }

            System.out.println("El precio final es: " + precioFinal + "€");

            System.out.println("¿Hay más clientes? (S o N)");
            nuevoCliente = teclado.nextLine();
            
        } while (nuevoCliente.equalsIgnoreCase("s"));

    }

}
