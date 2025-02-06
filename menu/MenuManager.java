//package menu;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class MenuManager {
//    public void exec() {
//        System.out.println("Executando...");
//        File directory = new File("../exercises");
//        List<File> files = Arrays.asList(directory.listFiles());
//
//        if(files.isEmpty()) {
//            System.out.println("Nenhum arquivo encontrado.");
//            return;
//        }
//
//        int selectedIndex = 0;
//
//        while (true) {
//            clearScreen();
//            System.out.println("Use ↑ e ↓ para navegar. Pressione Enter para executar.");
//            System.out.println("--------------------------------------------------------");
//            for (int i = 0; i < files.size(); i++) {
//                if (i == selectedIndex) {
//                    System.out.println(" 👉 " + files.get(i).getName()); // Destaca o arquivo atual
//                } else {
//                    System.out.println("    " + files.get(i).getName());
//                }
//            }
//
//            try {
//                int key = MenuManager.readKey();
//
//                if (key == 65) { // Código ANSI para seta ↑
//                    selectedIndex = (selectedIndex - 1 + files.size()) % files.size();
//                } else if (key == 66) { // Código ANSI para seta ↓
//                    selectedIndex = (selectedIndex + 1) % files.size();
//                } else if (key == 10) { // Código do Enter
//                    System.out.println("Executando: " + files.get(selectedIndex).getName());
//                    break;
//                }
//            } catch (IOException ioe) {
//                System.out.println(ioe.getMessage());
//                break;
//            }
//        }
//    }
//
//
//
//}
