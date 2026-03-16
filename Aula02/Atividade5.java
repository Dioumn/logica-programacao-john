package Aula02;

// Recebe informações do usuário e exibe os dados cadastrados, com resultados padrões em caso de valores inválidos.

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitar informações do usuário
        System.out.print("Informe seu Nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.print("Informe sua data de nascimento: ");
        String dataNascimento = scan.nextLine();
        System.out.print("Informe seu Naturalidade: ");
        String naturalidade = scan.nextLine();
        System.out.print("Informe seu nacionalidade: ");
        String nacionalidade = scan.nextLine();
        System.out.print("Informe seu matricula: ");
        String matricula = scan.nextLine();

        //verifica se a matricula é um número válido
        if (!matricula.matches("\\d+")) {
            matricula = "Não informado";
        }

        // Exibir as informações cadastradas
        System.out.println("Dados cadastrados:");
        System.out.println("Nome: " + (nomeCompleto.isEmpty() ? "Cleitinho Juliete Rosa" : nomeCompleto));
        System.out.println("Data de nascimento: " + (dataNascimento.isEmpty() ? "03/10/1500" : dataNascimento));
        System.out.println("Naturalidade: " + (naturalidade.isEmpty() ? "Irlanda" : naturalidade));
        System.out.println("Nacionalidade: " + (nacionalidade.isEmpty() ? "Coreano" : nacionalidade));
        System.out.println("Matricula: " + (matricula.isEmpty() ? "7777777777" : matricula));

        // Fechar o scanner
        scan.close();
    }
}
