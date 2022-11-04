//    Escribe un programa que solicite al usuario un número N y luego muestre por pantalla la siguiente ejecución:
//        1
//        1 2
//        1 2 3
//        ……
//        1 2 3 ….N
//        ….
//        1 2 3
//        1 2
//        1

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numFilas = sc.nextInt();


        System.out.println();
        for(int i = 1; i<=numFilas; i++){
            //Espacios en blanco
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = numFilas; i>0; i--){
            //Espacios en blanco
            for(int j = 1; j<i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}