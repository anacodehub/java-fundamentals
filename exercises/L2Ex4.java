package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2Ex4 {

    public static void main(String[] args) {
        double PI = 3.14;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double radius = 0;

        System.out.print("Raio do circulo (cm): ");

        if(input.hasNextDouble()) {
            radius = input.nextDouble();
        } else {
            System.out.println("Valor inválido. Informe um valor numerico!");
        }

        double perimeter = 2*PI*radius;

        System.out.print("Perimetro do circulo: "+df.format(perimeter)+ " cm");
        System.out.print("\n\n");
    }
}
