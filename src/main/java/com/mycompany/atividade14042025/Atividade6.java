package com.mycompany.atividade14042025;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade6 {

    public void ativ6() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pacientes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\nMENU - Cadastro de Pacientes");
            System.out.println("1. Cadastrar paciente");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nome = scanner.nextLine();
                    pacientes.add(nome);
                    System.out.println("Paciente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 2);
    }
}
