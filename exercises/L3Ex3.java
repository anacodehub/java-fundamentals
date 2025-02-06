package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L3Ex3 {
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

        if(number>0) {
            System.out.println("O numero eh positivo");
            System.out.print("\n");
        }

        if(number<0) {
            System.out.println("O numero eh negativo");
            System.out.print("\n");
        }

        if(number == 0){
            System.out.println("O numero eh igual a 0");
            System.out.print("\n");
        }
    }
}
