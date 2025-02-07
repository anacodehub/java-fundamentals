import java.util.Scanner;

public class L4Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1=0, num2=0, num3=0;

        System.out.print("Primeiro numero: ");

        if(input.hasNextInt()) {
            num1 = input.nextInt();
        } else {
            System.out.println("Valor do primeiro número inválido.");
        }

        System.out.print("Segundo numero: ");

        if(input.hasNextInt()) {
            num2 = input.nextInt();
        } else {
            System.out.println("Valor do segundo número inválido.");
        }

        System.out.print("Terceiro numero: ");

        if(input.hasNextInt()) {
            num3 = input.nextInt();
        }

        else {
            System.out.println("Valor do terceiro número inválido.");
        }

        int sum = num1+num2+num3;

        String isDivisibleByFive = sum % 5 == 0 ? "eh divisivel" : "nao eh divisivel";


        System.out.println("A soma dos numero "+isDivisibleByFive+" por cinco");
    }
}
