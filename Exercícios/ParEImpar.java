package pratica;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtNumeros;
        int numero;
        int contador = 0;
        int qtPares = 0, qtImpares = 0;

        System.out.println("Quantidade de números: ");
        qtNumeros = scan.nextInt();


        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            contador++;

            if (numero % 2 == 0) qtPares++;
            else qtImpares++;

        } while(contador < qtNumeros);

        System.out.println("Quantidade Par: " + qtPares);
        System.out.println("Quantidade Impar: " + qtImpares);


    }

}
