//Escribe un programa que lea un número entero por teclado e indique si es par o impar.

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        int entrada = sc.nextInt();
        int entrada2 = entrada % 2;


        if (entrada2 == 0 ){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}
