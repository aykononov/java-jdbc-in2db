
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
                System.out.println("Читаем файл конфигурации: " + fileIni);
                try {
                    FileReader reader = new FileReader(dir + this.fileIni);
                    Scanner scanner = new Scanner(reader);
                    while (scanner.hasNextLine()) {
                        String value = scanner.nextLine();
                        int pos = value.indexOf("=");
                        if (pos > 0 && !value.startsWith("#")) {
                            System.out.print(value.substring(0,pos).concat(": "));
                            if (value.substring(0,pos).equals("driver")) {
                                driver = value.substring(pos+1);
                                System.out.println(driver);
                            }
                            if (value.substring(0,pos).equals("url")) {
                                url = value.substring(pos+1);
                                System.out.println(url);
                            }
                            if (value.substring(0,pos).equals("username")) {
                                username = value.substring(pos+1);
                                System.out.println(username);
                            }
                            if (value.substring(0,pos).equals("password")) {
                                password = value.substring(pos+1);
                                System.out.println(password);
                            }
                        }

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

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
