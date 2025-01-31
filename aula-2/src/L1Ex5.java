import java.util.Scanner;

public class L1Ex5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        if (input.hasNextInt()) {
            int numero = input.nextInt();

            System.out.println("25% de "+numero+" eh "+ numero*0.25);

        } else {
            System.out.println("Numero invalido! Digite um numero inteiro!");
        }
    }
}
