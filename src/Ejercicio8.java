//Escribe un programa que solicite al usuario un número N y luego muestre por pantalla la siguiente ejecución:
//1
//1 2
//1 2 3
//1 2 3 4
//…………
//1 2 3 4 …..N

import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j<=i; j++)

            System.out.print(j + " ");
            System.out.println();
        }
    }
}
