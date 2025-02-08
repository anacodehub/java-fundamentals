/*
CLASSIFICAÇÃO DE IDADE POR CATGOERIA ESPORTIVA

    Um clube esportivo deseja classificar seus atletas com base na idade.

    As categorias são:
    - Infantil:> até 12 anos
    - Juvenil: de 13 a 17 anos
    = Adulto: de 18 a 48 anos
    - Master: acima de 40 anos
*/

import java.util.Scanner;

public class Ex6 {
    enum Categories {
        INFANTIL("infantil"),
        JUVENIL("juvenil"),

        ADULTO("adulto"),
        MASTER("master");


        private final String name;

        Categories(String nome) {
            this.name = nome;
        }

        // Método para retornar o nome associado ao enum
        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int age = 0;

        String category = "";

        System.out.print("\nDigite a idade: ");

        if(ler.hasNextInt()) {
            age = ler.nextInt();
        } else {
            System.out.print("\nValor inválido.");
            System.out.print("\n");
        }

        if(age>40) {
            category = Categories.MASTER.getName();
        }

        if(age<=40) {
            category = Categories.ADULTO.getName();
        }

        if(age<=17) {
            category = Categories.JUVENIL.getName();
        }

        if(age<=12) {
            category = Categories.INFANTIL.getName();
        }

        System.out.print("\nCategoria do aluno: "+category);
        System.out.print("\n");
    }
}
