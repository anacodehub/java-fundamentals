package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L3Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        double num1 = 0, num2 = 0;

        System.out.print("Primeiro numero: ");

        if (input.hasNextDouble()) {
            num1 = input.nextDouble();
        } else {
            System.out.print("Valor deve ser numerico!");

        }


        System.out.print("Segundo numero: ");

        if (input.hasNextDouble()) {
            num2 = input.nextDouble();
        } else {
            System.out.print("Valor deve ser numerico!");
        }

        double bigger = Math.max(num1, num2);
        String biggerName = num1>num2 ? "primeiro numero" : "segundo numero";

        if(num1==num2) {
            System.out.print("Os numeros sao iguais.");
            System.out.print("\n\n");
            return;
        }

        System.out.print("O maior numero eh o "+ biggerName+", "+df.format(bigger));

        System.out.print("\n\n");
    }
}
