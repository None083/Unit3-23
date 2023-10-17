/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class EjerBucleHoras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean aux;
        String resp = "s";
        int numSeg;
        int numMin;
        int numHora;

        do {
            do {
                System.out.println("Introduce segundos");
                numSeg = teclado.nextInt();
                teclado.nextLine();
            } while (!(numSeg >= 0 && numSeg <= 59));

            do {
                System.out.println("Introduce minutos");
                numMin = teclado.nextInt();
                teclado.nextLine();
            } while (!(numMin >= 0 && numMin <= 59));

            do {
                System.out.println("Introduce hora");
                numHora = teclado.nextInt();
                teclado.nextLine();
            } while (!(numHora >= 0 && numHora <= 23));

            System.out.println("¿Quieres volver a ejecutar el programa? Escribe S o N");
            teclado.nextLine();
            resp = teclado.nextLine();

        } while (resp.equalsIgnoreCase("s"));

    }

}
