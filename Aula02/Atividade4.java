package Aula02;

// Recebe 3 palavras e printa elas em uma única linha

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Solicita as palavras
        System.out.print("Informe a primeira palavra: ");
        String palavra1 = scan.nextLine();
        System.out.print("Informe a segunda palavra: ");
        String palavra2 = scan.nextLine();
        System.out.print("Informe a terceira palavra: ");
        String palavra3 = scan.nextLine();

        // Exibe as palavras em uma única linha
        System.out.println(palavra1 + " " + palavra2 + " " + palavra3);

        scan.close();
    }
}
