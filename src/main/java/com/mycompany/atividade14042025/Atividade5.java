/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade14042025;

import java.util.Scanner;
import java.util.ArrayList;


public class Atividade5 {
    
    public void ativ5(Scanner scanner){
    
         ArrayList<String> medicos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\nMENU - Cadastro de Médicos");
            System.out.println("1. Cadastrar médico");
            System.out.println("2. Listar médicos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do médico: ");
                    String nome = scanner.nextLine();
                    medicos.add(nome);
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de médicos cadastrados:");
                    if (medicos.isEmpty()) {
                        System.out.println("Nenhum médico cadastrado ainda.");
                    } else {
                        for (int i = 0; i < medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
        
    }
    
}
