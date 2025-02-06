package exercises;/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia os lados do retângulo
e exiba o seu perímetro e a área.
* */

import java.text.DecimalFormat;
import java.util.Scanner;

public class L1Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        float height = 0;
        float base = 0;

        System.out.print("Altura: ");

        if(input.hasNextFloat()) {
            height = input.nextFloat();
        } else {
            System.out.println("Valor para altura deve ser um numero!");
            return;
        }

        System.out.print("Base: ");
        if(input.hasNextFloat()) {
            base = input.nextFloat();
        } else {
            System.out.println("Valor para base deve ser um numero!");
            return;
        }

        float perimeter = (base*2)+(height*2);
        float area = base*height;

        System.out.print("\nArea: " + df.format(area) + "\n" + "Perimetro: "+ df.format(perimeter));
    }
}
