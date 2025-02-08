import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double num1 = 0, num2 = 0;
        int operation = 0;
        double result = 0;

        System.out.println("\n\n-----------------------------------------");
        System.out.println("|-------- C A L C U L A D O R A --------|");
        System.out.println("|---------------------------------------|");
        System.out.println("|--------------- Entrada ---------------|");
        System.out.print(" Digite o primeiro numero: ");

        if (input.hasNextDouble()) {
           num1 = input.nextInt();
        } else {
            System.out.println("Entrada invalida.");
            System.out.println("\n");
        }
        System.out.print(" Digite o segundo numero: ");

        if (input.hasNextDouble()) {
            num2 = input.nextInt();
        } else {
            System.out.println("Entrada invalida.");
            System.out.println("\n");
        }

        System.out.println("|---------------------------------------|");
        System.out.println("|---------- Executar operacao ----------|");
        System.out.println("| 1 - Adicao                            |");
        System.out.println("| 2 - Subtracao                         |");
        System.out.println("| 3 - Multiplicacao                     |");
        System.out.println("| 4 - Divisao                           |");
        System.out.println("|---------------------------------------|");

        if(input.hasNextInt()) {
            operation = input.nextInt();
        } else {System.out.println("Valor de operacao invalido! Finalizando...\n");

        }

        System.out.println("|-------------- Resultado --------------|");

        switch (operation) {
            case 1: {
                result = num1+num2;
                break;
            }

            case 2: {
                result = num1-num2;
                break;
            }

            case 3: {
                result = num1*num2;
                break;
            }

            case 4: {
                result = num1/num2;
                break;
            }
        }

        System.out.println(" "+result+"                            ");
        System.out.println("|---------------------------------------|");


    }
}
