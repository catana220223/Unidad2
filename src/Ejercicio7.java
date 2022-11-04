//Escribe un programa que lea un número entero N mayor que 0 y calcule la suma 1+2+3+4+5+6+...+N

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        int resultado = 0;

        System.out.println();
        for (int i = 0; i <= numero; i++) {
                resultado = resultado + i;
            }
        System.out.println(resultado);
        }
}
