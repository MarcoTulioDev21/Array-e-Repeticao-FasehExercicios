
package com.mycompany.atividade14042025;


public class Atividade4 {
    
    public void ativ4() {
        double soma = 0;
        int numerador = 1000;
        int sinal = 1; // alterna entre 1 e -1

        for (int i = 1; i <= 50; i++) {
            soma += sinal * ((double) numerador / i);
            numerador -= 3;
            sinal *= -1; // inverte o sinal
        }

        System.out.printf("A soma dos 50 primeiros termos da série é: %.2f\n", soma);
    }
}

