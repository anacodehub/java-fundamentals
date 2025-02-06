package exercises;

import java.util.Scanner;

public class L3Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade1=0, grade2=0, average=0;

        System.out.print("Nota P1: ");

        if(input.hasNextDouble()) {
            grade1 = input.nextDouble();
        } else {
            System.out.println("Informe um valor numerico");
        }

        System.out.print("Nota P2: ");

        if(input.hasNextDouble()) {
            grade2 = input.nextDouble();
        } else {
            System.out.println("Informe um valor numerico");
        }

        average = (grade1+grade2)/2;

        String finalResult = average >=6 ? "aprovado" : "reprovado";

        System.out.print("Aluno "+ finalResult);
        System.out.println("\n");

    }
}
