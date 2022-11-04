//Escribe un programa que lea del teclado tres números e indique el mayor de ellos.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero : ");
        double numero = sc.nextDouble();

        System.out.print("Introduce otro numero : ");
        double numero2 = sc.nextDouble();

        System.out.print("Introduce un numero más : ");
        double numero3 = sc.nextDouble();

        if (numero > numero2 && numero > numero3) {
            System.out.println("El numero mas grande es el: " +numero);
        } else if (numero2 > numero && numero2 > numero3) {
            System.out.println("El numero mas grande es el: " +numero2);
        } else {
            System.out.println("\nEl numero mas grande es el: " +numero3);
        }
    }
}