/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer0610 {

    /**
     * a, dice si un numero es par o impar 
     * b, dice si el mes es valido (1-12), y el nombre 
     * c, 3 numeros(h,m,s) y tiene que decir si es una hora válida
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Locale locale = new Locale("es", "ES");

        System.out.println("""
                           
                                 ESCOGE UNA OPCIÓN
                           ------------------------------
                           A - Número par o impar
                           B - Més válido
                           C - Hora válida
                           
                           """);

        String opcionSt = teclado.nextLine().toUpperCase();
        char opcion = opcionSt.charAt(0);

        switch (opcion) {
            case 'A' -> {
                System.out.println("Introduce un número entero");
                int numero = teclado.nextInt();
                teclado.nextLine();

                if (numero % 2 == 0) {
                    System.out.println("El número" + numero + " es par");
                } else {
                    System.out.println("El número" + numero + " es impar");
                }

            }
            case 'B' -> {
                System.out.println("Introduce un mes (número)");
                int numMes = teclado.nextInt();
                
                if (numMes>=1 && numMes<=12) {
                    
                    String nomMes = Month.of(numMes).getDisplayName(TextStyle.FULL, locale);
                    System.out.println(numMes + " es un mes válido correspondiente a " + nomMes);
                    
                } else{
                    System.out.println(numMes + " no es un mes válido");
                }

            }
            case 'C' -> {
                System.out.println("Introduce segundos");
                int numSeg = teclado.nextInt();
                System.out.println("Introduce minutos");
                int numMin = teclado.nextInt();
                System.out.println("Introduce hora");
                int numHora = teclado.nextInt();
                
                if ((numSeg<=0 && numSeg>=59) && (numMin<=0 && numMin>=59) && (numHora<=0 && numHora>=23)) {
                    System.out.println("La hora " + numHora + ":" + numMin + ":" + numSeg + " es válida");
                } else{
                    System.out.println("La hora " + numHora + ":" + numMin + ":" + numSeg + " NO es válida");
                }
            }
            default ->{
                System.out.println("Chao pescao");
            }
        }

    }

}
