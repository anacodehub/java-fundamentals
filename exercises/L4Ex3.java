import java.util.Scanner;

public class L4Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1=0, num2=0, num3=0;
        int smallest=0, middle=0, biggest=0;

        System.out.print("Primeiro numero: ");

        if(input.hasNextInt()) {
            num1 = input.nextInt();
        } else {
            System.out.println("Valor do primeiro numero invalido.");
            System.out.println("\n");
            return;
        }

        System.out.print("Segundo numero: ");

        if(input.hasNextInt()) {
            num2 = input.nextInt();
        } else {
            System.out.println("Valor do segundo numero invalido.");
            System.out.println("\n");
            return;
        }

        System.out.print("Terceiro numero: ");

        if(input.hasNextInt()) {
            num3 = input.nextInt();
        } else {
            System.out.println("Valor do terceiro numero invalido.");
            System.out.println("\n");
            return;
        }

        if(((num1>num2) && (num1<num3)) || (num1>num3) && (num1<num2)) {
            middle = num1;

            if(num2<num3) {
                smallest = num2;
                biggest = num3;
            } else {
                smallest = num3;
                biggest = num2;
            }
        }

        if(((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1))){
            middle = num2;

            if(num1<num3) {
                smallest = num1;
                biggest = num3;
            } else {
                smallest = num3;
                biggest = num1;
            }
        }

        if(((num3>num1) && (num3<num2)) || (num3>num2) && (num3<num1)){
            middle = num3;

            if(num1<num2) {
                smallest = num1;
                biggest = num2;
            } else {
                smallest = num2;
                biggest = num1;
            }
        }

        System.out.println("Ordem crescente: "+smallest+ ", "+middle+", "+biggest+".");

    }
}
