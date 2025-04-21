package com.mycompany.atividade14042025;

import java.util.Scanner;

public class Atividade3 {

    public void ativ3(Scanner scanner) {
        final int TOTAL_PESSOAS = 10;

        int[] idades = new int[TOTAL_PESSOAS];
        double[] pesos = new double[TOTAL_PESSOAS];
        double[] alturas = new double[TOTAL_PESSOAS];

        int somaIdades = 0;
        int contadorPesoAltura = 0;
        int contadorIdadeAltura = 0;
        int totalMais190 = 0;

        // Coletando dados com array
        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            System.out.println("Pessoa " + (i + 1));

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            somaIdades += idades[i];

            System.out.print("Peso (kg): ");
            pesos[i] = scanner.nextDouble();

            System.out.print("Altura (m): ");
            alturas[i] = scanner.nextDouble();

            if (pesos[i] > 90 && alturas[i] < 1.50) {
                contadorPesoAltura++;
            }

            if (alturas[i] > 1.90) {
                totalMais190++;
                if (idades[i] >= 10 && idades[i] <= 30) {
                    contadorIdadeAltura++;
                }
            }

            System.out.println("---------------------------");
        }

        double mediaIdades = (double) somaIdades / TOTAL_PESSOAS;
        double porcentagemEntre10e30 = totalMais190 > 0
                ? ((double) contadorIdadeAltura / totalMais190) * 100
                : 0.0;

        // Menu
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Mostrar média das idades");
            System.out.println("2. Mostrar total com peso > 90kg e altura < 1.50m");
            System.out.println("3. Mostrar % de pessoas entre 10-30 anos com mais de 1.90m");
            System.out.println("4. Mostrar todos os dados coletados");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Média das idades: %.2f anos\n", mediaIdades);
                    break;

                case 2:
                    System.out.println("Total de pessoas com peso > 90kg e altura < 1.50m: " + contadorPesoAltura);
                    break;

                case 3:
                    System.out.printf("Porcentagem com idade entre 10 e 30 anos entre os com mais de 1.90m: %.2f%%\n",
                            porcentagemEntre10e30);
                    break;

                case 4:
                    System.out.println("Dados coletados:");
                    for (int i = 0; i < TOTAL_PESSOAS; i++) {
                        System.out.printf("Pessoa %d - Idade: %d anos | Peso: %.2f kg | Altura: %.2f m\n",
                                i + 1, idades[i], pesos[i], alturas[i]);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);
    }
}
