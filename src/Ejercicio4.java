//Escribe un programa que indique si un número entero leído por teclado se puede expresar como el cuadrado de un número entero.
// Por ejemplo, el número 9 se puede expresar como el cuadrado de 3, mientras que el 8 no.
// (Pista, no hace falta utilizar repetición, utilizar librería matemática).


import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();




        if (Math.sqrt(numero)-(int)Math.sqrt(numero) == 0) {
            System.out.printf("Tiene raiz cuadrada");
        }else
            System.out.printf(" no Tiene raiz cuadrada");

        }

    }

/*
         .o88b.  .d8b.  d888888b  .d8b.  d8b   db  .d8b.
        d8P  Y8 d8' `8b `~~88~~' d8' `8b 888o  88 d8' `8b
        8P      88ooo88    88    88ooo88 88V8o 88 88ooo88
        8b      88~~~88    88    88~~~88 88 V8o88 88~~~88
        Y8b  d8 88   88    88    88   88 88  V888 88   88
         `Y88P' YP   YP    YP    YP   YP VP   V8P YP   YP
    */