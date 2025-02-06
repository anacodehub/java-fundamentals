import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
    try {
        System.out.println("\n\n************************************************");
        System.out.println("             Executar exercicio");
        System.out.println("************************************************\n");

        File directory = new File("exercises");

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Erro: O diretório 'exercises' não existe!");
            return;
        }

        List<File> files = Arrays.asList(directory.listFiles());

        if (files.isEmpty()) {
            System.out.println("Nenhum arquivo encontrado.");
            return;
        }

        int key=0;

//           System.out.println("Use as setas para navegar. Pressione Enter para executar.");
//            System.out.println("--------------------------------------------------------");

        for (int i = 0; i < files.size(); i++) {
            System.out.println(i+1 +" - " + files.get(i).getName());
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nCODIGO: ");

        if(input.hasNextInt()) {

            int selectedIndex = input.nextInt();

            if(selectedIndex<=0 || selectedIndex>files.size()) {
                System.out.println("Numero invalido!");
                return;
            }

            System.out.print("Executando"+"...\n\n");

            File selectedFile = files.get(selectedIndex-1);

            if (selectedFile.getName().endsWith(".java")) {
                executeJavaClass(selectedFile);
            }
        } else {
            System.out.println("Informe um valor numerico!");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }


    }

    private static void executeJavaClass(File file) {
        try {
            String exerciseFileName = file.getPath();
            ProcessBuilder pb = new ProcessBuilder("java", exerciseFileName);
            pb.inheritIO();
            Process process = pb.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

