package aulas;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("\nDigite um numero inteiro: ");

        numero = ler.nextInt();

        if(numero>100) {
            System.out.println("O numero eh maior que 100");
        } else if (numero == 100) {
            System.out.println("O numero eh igual a 100");
        } else {
            System.out.println("O numero eh menor que 100");
        }
    }
}
