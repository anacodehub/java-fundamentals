package aulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double p1 = 0, p2 = 0;

        System.out.print("Nota P1: ");

        if(input.hasNextDouble()) {
            p1 = input.nextDouble();
        } else {
            System.out.print("Valor de P1 deve ser um numero");
        }

        System.out.print("Nota P2: ");

        if(input.hasNextDouble()) {
            p2 = input.nextDouble();
        } else {
            System.out.print("Valor de P2 deve ser um numero");
        }

        double mediaFinal = (p1+(2*p2))/3;

        System.out.print("\nMEDIA FINAL: "+ df.format(mediaFinal));
    }
}
