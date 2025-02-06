package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L1Ex8 {
    public static void main(String[] args) {
        int MINIMUM_SALARY = 1640;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe o salario: ");

        if (input.hasNextFloat()) {
            float salary = input.nextFloat();

            float salaries = salary/MINIMUM_SALARY;

            System.out.print("\nQuantidade de salarios: " + df.format(salaries));

        } else {
            System.out.println("Informe um valor numerico!");
        }
    }
}
