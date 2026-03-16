package Aula02;

// Recebe informações do usuário e exibe os dados cadastrados

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

// Solicitar informações do usuário
    System.out.print("Informe seu Nome completo: ");
    String nomeCompleto = scan.nextLine();
    System.out.print("Informe seu Endereço: ");
    String endereco = scan.nextLine();
    System.out.print("Informe seu CEP: ");
    String cep = scan.nextLine();
    System.out.print("Informe seu Telefone: ");
    String telefone = scan.nextLine();

// Exibir as informações cadastradas
    System.out.println("Dados cadastrados:");
    System.out.println("Nome: " + nomeCompleto);
    System.out.println("Endereço: " + endereco);
    System.out.println("CEP e Telefone: " + cep + " - " + telefone);

// Fechar o scanner
    scan.close();

    }

}
