/*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
    meses e dias e mostre-a expressa em dias. Leve em consideração o ano
    com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

package desafios;

import java.util.Scanner;

public class AliveDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int years = 0, months = 0, days = 0;

        System.out.print("Anos: "+years);

        if(input.hasNextInt()) {
            years = input.nextInt();
        }

        System.out.print("Meses: "+months);

        if(input.hasNextInt()) {
            months = input.nextInt();
        }

        System.out.print("Dias: "+days);

        if(input.hasNextInt()) {
            days = input.nextInt();
        }
    }
}
