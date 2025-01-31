import java.util.Scanner;

public class L1Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        if(input.hasNextInt()) {
            int numero = input.nextInt();

            System.out.println("O triplo de numero eh: "+numero*3);
        }else{
            System.out.println("Informe um numero inteiro válido!");
        }
    }
}
