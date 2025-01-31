/*
Descrição do exercício:
1. Faça um fluxograma e um programa utilizando a linguagem Java
que imprima a média aritmética de duas notas. Obs. Utilize o tipo
de dados real (decimal)
* */

import java.text.DecimalFormat;
import java.util.Scanner;

public class L1Ex {

    public static void main (String[] args) {
        // Instanciando e criando um objeto Scanner para leitura  de dados
        Scanner read = new Scanner(System.in);

        // Classe para formatação de número
        DecimalFormat df = new DecimalFormat("#.00");

        // Declarando as variáveis
        double average, score1, score2;

        // Entrada de dados manual
        System.out.print("Digite a primeira nota: ");
        score1 = read.nextFloat();

        System.out.print("\n");

        // Entrada de dados manual
        System.out.print("Digite a primeira nota: ");
        score2 = read.nextFloat();

        System.out.print("\n");

        average = L1Ex.calculareAverage(score1, score2);

        // Exibir a mensagem
        System.out.println("A media eh: " + df.format(average));
    }

    public static double calculareAverage(Double score1, Double score2) {
        return (score1+score2)/2;
    }
}
