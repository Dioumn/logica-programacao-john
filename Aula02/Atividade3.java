package Aula02;

// Recebe uma temperatura em Celsius e converte para outras escalas, incluindo validação para temperaturas abaixo do zero absoluto.

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Solicita a temperatura em Celsius
    System.out.print("Informe a temperatura em Celsius: ");
    double celsius = scan.nextDouble();
    if (celsius < -273.15){
        System.out.println("Temperatura inválida. A temperatura em Celsius não pode ser menor zero absoluto (0 Kelvin).");
            celsius = scan.nextDouble();
    }

    // Converção
    double fahrenheit = (celsius * 9/5) + 32;
    double kelvin = celsius + 273.15;
    double reaumur = celsius * 4/5;
    double rankine = (celsius + 273.15) * 9/5;

    // Exibir o resultado
    System.out.println("Temperatura em:");
    System.out.printf("Celsius: %.2f°C%n", celsius);
    System.out.printf("Kelvin: %.2fK%n", kelvin);
    System.out.printf("Réaumur: %.2f°Ré%n", reaumur);
    System.out.printf("Rankine: %.2f°R%n", rankine);
    System.out.printf("Fahrenheit: %.2f°F%n", fahrenheit);

    // Fechar o scanner
    scan.close();
    }
}
