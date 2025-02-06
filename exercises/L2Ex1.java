package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class L2Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

//        System.out.println("\n\nOPERATIONS");

        System.out.print("Primeiro numero: ");
        if(input.hasNextDouble()) {
            num1 = input.nextDouble();
        } else {
            System.out.println("Valor invalido!");
        }

        System.out.print("Segundo numero: ");
         if (input.hasNextDouble()) {
            num2 = input.nextDouble();
        } else {
            System.out.println("Valor invalido!");
        }

        String[] operations = {"addition", "subtraction", "multiplication", "division"};

         String results = "";
//         System.out.println("\n\nOPERATIONS" + operations)

         for (String operation : operations) {
            switch (operation) {
                case "addition": {
                    results = results + "\nSOMA: "+(num1+num2)+ "\n";
                    break;
                }

                case "subtraction": {
                    results = results + "SUBTRACAO: "+(num1-num2)+ "\n";
                    break;
                }

                case "multiplication": {
                    results = results + "MULTIPLICACAO: "+(num1*num2)+ "\n";
                    break;
                }

                case "division": {

                    String division;

                    if (num2 == 0) {
                        division = "Denominador deve ser maior do que 0";
                    } else {
                        division =  String.valueOf(num1/num2);
                    }

                    results = results + "DIVISAO: " + division + "\n";
                    break;
                }
            }
        }

         System.out.println(results);
    }
}
