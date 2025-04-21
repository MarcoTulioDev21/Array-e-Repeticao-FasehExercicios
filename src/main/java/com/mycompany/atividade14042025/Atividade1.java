package com.mycompany.atividade14042025;

import java.util.Scanner;

public class Atividade1 {

    double channelNumber, numberPeople, numberTelevision;
    double percentual;

    public void ativ1(Scanner scanner) {

        System.out.println("Insira o número do canal.");
        channelNumber = scanner.nextInt();
        System.out.println("Insira a quantidade de televisões pesquisadas.");
        numberTelevision = scanner.nextInt();
        System.out.println("Insira a quantidade de televisões que estavam neste canal.");
        numberPeople = scanner.nextInt();

        percentual = ( numberPeople / numberTelevision) * 100;

        System.out.println("Canal: " + channelNumber);
        System.out.println("Qtd pesquisas: " + numberTelevision);
        System.out.printf("Percentual: %.2f%%\n", percentual); // mostra com 2 casas decimais
    }
}
