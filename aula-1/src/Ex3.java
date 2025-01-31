import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        System.out.println("SENAI \"Gaspar Ricardo Junior\"");
        System.out.println("\\o/");

        System.out.println("#### ARVORE 1 ####");

        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println("  *");

        System.out.println("\n");
        System.out.println("#### ARVORE 2 ####");
        System.out.println("   *\n  ***\n *****\n*******\n   *");

        System.out.println("\n");
        System.out.println("#### ARVORE 3 ####");

        System.out.print("  *");
        System.out.print("\n");
        System.out.print(" *");
        System.out.print("*");
        System.out.print("*");
        System.out.print("\n");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("\n");
        System.out.print("  *");

        System.out.println("\n");
        System.out.println("#### ARVORE 4 ####");

        System.out.println("  *");
        System.out.print(" *");
        System.out.print("*");
        System.out.println("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");
        System.out.print("  *");

        System.out.println('\n');

        Ex3.makeTree();

//        System.out.println("#### ARVORE 5 ####" + "\n" + arvore);

    }

    public static void makeTree () {
        try {

            Scanner inputTreeLength = new Scanner(System.in);

            System.out.print("Digite o tamanho da base da arvore: ");
            int treeBase = inputTreeLength.nextInt();

            System.out.print("\n");

            if (treeBase>21) {
                throw new Exception("Tamanho maximo da arvore eh 20");
            }

            if (treeBase<3) {
                throw new Exception("Tamanho minimo  da arvore eh 3");
            }

            String tree;


            int rootAsideSpaces;


//            if (treeLength==0) {
//                treeLength++;
//            }
//
//            int root = (treeLength-1)/2;

            System.out.println("Eu sou uma árvore, confia");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



