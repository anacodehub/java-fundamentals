package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L2Ex5 {
    public static void main(String[] args) {

        double PI = 3.14;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double radius = 0;

        System.out.print("Raio do circulo (mm): ");

        if(input.hasNextDouble()) {
            radius = input.nextDouble();
        } else {
            System.out.println("Valor inválido. Informe um valor numerico!");
        }

        double area = PI*(radius*radius);

        System.out.print("Area do circulo: "+df.format(area)+ " mm");
        System.out.print("\n\n");
    }
}
