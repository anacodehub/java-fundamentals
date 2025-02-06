package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L3Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        double number = 0;

        System.out.print("Informe um numero: ");

        if(input.hasNextDouble()) {
           number = input.nextDouble();
        } else {
            System.out.print("Valor deve ser numerico");
            System.out.print("\n");
        }

        if(number%2==0) {
            System.out.println("O numero eh par");
            System.out.print("\n");
        }

        if(number%2==1) {
            System.out.println("O numero eh impar");
            System.out.print("\n");
        }
    }
}
