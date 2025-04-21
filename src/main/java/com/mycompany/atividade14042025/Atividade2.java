package com.mycompany.atividade14042025;

import java.util.Scanner;

public class Atividade2 {

    public void ativ2(Scanner scanner) {

        int opcao, peso1, peso2, peso3;
        double nota1, nota2, nota3, media;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Média Aritmética ");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair do programa");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira a primeira nota:");
                    nota1 = scanner.nextDouble();
                    System.out.println("Insira a segunda nota:");
                    nota2 = scanner.nextDouble();
                    media = (nota1 + nota2) / 2;
                    System.out.printf("A média aritmética das notas é: %.2f\n", media);
                    break;

                case 2:
                    System.out.println("Insira a primeira nota:");
                    nota1 = scanner.nextDouble();
                    System.out.println("Insira o peso correspondente à primeira nota:");
                    peso1 = scanner.nextInt();
                    System.out.println("Insira a segunda nota:");
                    nota2 = scanner.nextDouble();
                    System.out.println("Insira o peso correspondente à segunda nota:");
                    peso2 = scanner.nextInt();
                    System.out.println("Insira a terceira nota:");
                    nota3 = scanner.nextDouble();
                    System.out.println("Insira o peso correspondente à terceira nota:");
                    peso3 = scanner.nextInt();
                    media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
                    System.out.printf("A média ponderada das três notas é: %.2f\n", media);
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Erro! Opção inválida.");
            }

        } while (opcao != 3);

    }
}
