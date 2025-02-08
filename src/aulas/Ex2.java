package aulas;

import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class Ex2 {
    public static void main(String[] args) {
//        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner ler = new Scanner(System.in);

        // Declaração de variável

        int numero;

        numero = 15;

        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();

        System.out.println("Valor armazenado em numero: "+ numero);

    }
}
