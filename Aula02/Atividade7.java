package Aula02;

// Recebe dois números e um caractere representando a operação desejada, e exibe o resultado da operação, incluindo validação para operações inválidas.

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        char operacao;
        Scanner scan = new Scanner(System.in);

        // Solicita os dois números e a operação
        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        operacao = scan.next().charAt(0);

        // Valida a operação
        while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
            System.out.println("Operação inválida. Por favor, escolha uma operação válida");
            System.out.print("Digite a operação (+, -, *, /): ");
            operacao = scan.next().charAt(0);
        }

        // Realiza a operação e exibe o resultado
        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
            } else {
                System.out.println("Não é possível dividir por zero.");
            }
        } else {
            System.out.println("Operação inválida.");
        }

        scan.close();
    }
}