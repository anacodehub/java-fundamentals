package exercises;/*
Faça um fluxograma e um programa utilizando a linguagem Java que leia o lado do quadrado e
 exiba o seu perímetro e a área.
*/

import java.util.Scanner;

public class L1Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");

        if(input.hasNextFloat()) {
            float squareSide = input.nextFloat();
            float area = squareSide*squareSide;
            float perimeter = squareSide*4;

            System.out.print("\nArea: "+area+"\n"+"Perimetro: "+perimeter);
        } else {
            System.out.println("Valor invalido, informe um valor numerico!");
        }
    }

}
