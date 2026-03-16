package Aula02;

// Recebe um número e verifica se ele está entre -10 e 30, armazenando o resultado em uma variável booleana.

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        int numero;
        boolean condicao = false;
        Scanner scan = new Scanner(System.in);

        // Solicita um número do usuário
        System.out.print("Digite um número: ");
        numero = scan.nextInt();

        // Verifica se o número está entre -10 e 30 e armazena o resultado em uma variável booleana
        if (numero > -10) {
            if (numero < 30) {
                condicao = true;
            }
        }

        // Exibe o resultado
        if (condicao) {
            System.out.println("O número " + numero + " está entre -10 e 30.");
        } else {
            System.out.println("O número " + numero + " não está entre -10 e 30.");
        }

        scan.close();
    }
}