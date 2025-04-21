package com.mycompany.atividade14042025;

import java.util.Scanner;

public class Atividade14042025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha o exercício:");
            System.out.println("1. Exercício 1.");
            System.out.println("2. Exercício 2.");
            System.out.println("3. Exercício 3.");
            System.out.println("4. Exercício 4.");
            System.out.println("5. Exercício 5.");
            System.out.println("6. Exercício 6.");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Atividade1 atividade1 = new Atividade1();
                    atividade1.ativ1(scanner);
                    break;
                case 2:
                    Atividade2 atividade2 = new Atividade2();
                    atividade2.ativ2(scanner);
                    break;
                case 3:
                    Atividade3 atividade3 = new Atividade3();
                    atividade3.ativ3(scanner);
                    break;

                case 4:
                    Atividade4 atividade4 = new Atividade4();
                    atividade4.ativ4();
                    break;

                case 5:
                    Atividade5 atividade5 = new Atividade5();
                    atividade5.ativ5(scanner);
                    break;

                case 6:
                    Atividade6 atividade6 = new Atividade6();
                    atividade6.ativ6();  // Método da Atividade6
                    break;
            }

        } while (opcao != -1);
    }
}
