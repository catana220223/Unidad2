//Escribe un programa que lea del teclado dos números e indique si uno de ellos es múltiplo de otro.


import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        int numero2 = sc.nextInt();

        int aux = numero % numero2;
        int aux2 = numero2 % numero;

        if(aux == aux2){
            System.out.println("Son los dos multiplos");
        }
        else if (aux == 0){
            System.out.println("El primer numero es multiplo del segundo");

        }else if (aux2 == 0){
            System.out.println("El segundo numero es multiplo del primero");
        }

    }
}
