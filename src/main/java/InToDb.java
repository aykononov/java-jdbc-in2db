import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InToDb {

    public static void main(String[] args) {
        System.out.println("Start in2db...");
        ConfIni confIni = new ConfIni();
        try {
            System.out.println("Connection to DataBase...");
            Connection con = DriverManager.getConnection(confIni.getUrl(), confIni.getUsername(), confIni.getPassword());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

