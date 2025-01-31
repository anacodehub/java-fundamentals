import jdk.jfr.Experimental;

import java.util.Scanner;

public class L1Ex4 {
    public static void main(String[] args) {
        System.out.println(L1Ex4.exec());
    }

    public static String  exec(){
        int numero = L1Ex4.getNumber();

        return L1Ex4.getAddSubOneNumber(numero);
    }

    public static String  getAddSubOneNumber(int number) {
        int antecessor = number - 1;
        int predecessor = number + 1;

        return ("O antecessor de " + number + " eh " + antecessor + ", e o sucessor de " + number + " eh " + predecessor + ".");
    }

    public static int  getNumber(){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        if(input.hasNextInt()) {
            int numero = input.nextInt();
            return numero;
        } else {
            System.out.println("Número inválido! Digite um numero inteiro!\n");
            input.next();
            return getNumber();
        }
    }
}

