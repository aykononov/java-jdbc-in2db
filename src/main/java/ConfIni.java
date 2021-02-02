
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class ConfIni {

    private final String dir = "./";
    private final String ini = "config.ini";
    private String fileIni;
    private String driver;
    private String url;
    private String username;
    private String password;

    ConfIni() {
        File currentDir = new File(dir);
        File[] files = currentDir.listFiles();

        for (File f : files) {
            if (!f.isDirectory() && ini.equals(f.getName())) {
                this.fileIni = f.getName();
                System.out.println("Читаем файл конфигурации: " + fileIni + "\n");
                try {
                    FileReader reader = new FileReader(dir + this.fileIni);
                    Scanner scanner = new Scanner(reader);
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
        if (fileIni == null) {
            System.out.println("Отсутствует файл конфигурации (config.ini).");
        }

    }
}
