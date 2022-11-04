//Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua que penalice el
// consumo excesivo tal como indica la tabla siguiente:


//Consumo ( en metros cúbicos)
//€ por metro cúbico
//Primeros 100
//0.15
//De 100 a 500
//0.20
//De 500 a 1000
//0.35
//Más de 1000
//0.80


//Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en la pantalla el coste de agua total.
// Ten en cuenta que en la tabla se indica lo que hay que cobrar por los metros cúbicos que se encuentran en el intervalo.
// Así si hemos consumido 750 deberíamos pagar: 100*0.15+400*0.20+250*0.35 = 182.50 €. Usa constantes.

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce metros cubicos consumidos: ");
        int numero = sc.nextInt();

        final double PRIMEROS100= 0.15;
        final double DE100A500= 0.20;
        final double DE500A1000= 0.35;
        final double MASDE1000= 0.80;

        if (numero <= 100) System.out.print("Debes: " + (numero*PRIMEROS100));

        else if (numero >=101 && numero <= 500) {
            System.out.println("Debes " + (((numero - 100)*DE100A500) + (100*PRIMEROS100)));
        } else if (numero >=501 && numero <= 1000) {
            System.out.println("Debes " + (((numero - 500) * DE500A1000) + (500 * DE100A500)));
        }else {
                System.out.println ("Debes " + (((numero - 1000) * MASDE1000) + (1000 * DE500A1000)) + "€");
            }
        }
    }

