package pratica;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scan = new Scanner(System.in);

        while(true) {

            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }


        }

    }

