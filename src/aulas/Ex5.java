package aulas;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Declaração de variáveis
        double nota1 = 0, nota2 = 0, mediaAritmetica = 0;

        // ENTRADA DE DADOS

        System.out.print("Digita a nota 1 (0-100): ");

        if(ler.hasNextDouble()) {
            nota1 = ler.nextDouble();
        } else {
            System.out.println("Valor deve ser numerico!");
        }

        System.out.print("Digita a nota 2 (0-100): ");

        if(ler.hasNextDouble()) {
            nota2 = ler.nextDouble();
        } else {
            System.out.println("Valor deve ser numerico!");
        }

        // PROCESSAMENTO DE DADOS

        mediaAritmetica = (nota1+nota1)/2.0;

        if(mediaAritmetica>=50) {
            System.out.print("Parabens, voce esta aprovado :D com a nota: "+mediaAritmetica);
        } else {
            System.out.print("Infelizmente voce nao foi aprovado D: com a nota "+mediaAritmetica);
        }
    }
}
