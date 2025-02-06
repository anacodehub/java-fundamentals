package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Numero 1: ");

        if(input.hasNextDouble()) {
            num1 = input.nextDouble();
        } else {
            System.out.print("Valor de numero 1 deve ser um numero");
        }

        System.out.print("Numero 2: ");

        if(input.hasNextDouble()) {
            num2 = input.nextDouble();
        } else {
            System.out.print("Valor de numero 2 deve ser um numero");
        }

        System.out.print("Numero 3: ");

        if(input.hasNextDouble()) {
            num3 = input.nextDouble();
        } else {
            System.out.print("Valor de numero 3 deve ser um numero");
        }

        double mediaGeometrica = Math.pow((num1*num2*num3), (1.0/3));

        System.out.print("\nMEDIA GEOMETRICA: "+ df.format(mediaGeometrica));
    }
}
