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
public class EjerClase1910 {

    /**
     * 1.Un banco establece una contraeña secreta para acceso a sus cajeros.
     * Debe tener cuatro dígitos numéricos (entre 0 y 9) de forma que ninguno se
     * repita y la suma de los digitos intermedios sea par. El programa debe
     * solicitar al usuario tantos pin como sean necesarios hasta encontrar uno
     * válido.
     *
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //ejer1
        int num1;
        int num2;
        int num3;
        int num4;
        String parImpar;
        String valido;
        String pinGuay;

        do {
            System.out.println("Introduce un pin de 4 números de 0-9");

            do {
                System.out.println("Primer número");
                num1 = teclado.nextInt();
                valido = (num1>=0 && num1<=9) ? ("Válido") : ("No válido");
                System.out.println(valido);
            } while (!(num1>=0 && num1<=9));

            do {
                System.out.println("Segundo número");
                num2 = teclado.nextInt();
                valido = (num2>=0 && num2<=9) ? ("Válido") : ("No válido");
                System.out.println(valido);
            } while (!(num2>=0 && num2<=9));
            
            do {
                System.out.println("Tercer número");
                num3 = teclado.nextInt();
                valido = (num3>=0 && num3<=9) ? ("Válido") : ("No válido");
                System.out.println(valido);
            } while (!(num3>=0 && num3<=9));
            
            do {
                System.out.println("Cuarto número");
                num4 = teclado.nextInt();
                valido = (num4>=0 && num4<=9) ? ("Válido") : ("No válido");
                System.out.println(valido);
            } while (!(num4>=0 && num4<=9));

            parImpar = ((num2 + num3) % 2 == 0) ? ("par") : ("impar");
            
            pinGuay = (num1 == num2) || (num1 == num3) || (num1 == num4) || (num2 == num3)
                || (num2 == num4) || (num3 == num4) || (parImpar.equals("impar")) ? ("- Pin caca -") : ("- Pin guay -");
            System.out.println(pinGuay);

        } while ((num1 == num2) || (num1 == num3) || (num1 == num4) || (num2 == num3)
                || (num2 == num4) || (num3 == num4) || (parImpar.equals("impar")));

        System.out.println("La contraseña es: " + num1 + num2 + num3 + num4);

    }

}
