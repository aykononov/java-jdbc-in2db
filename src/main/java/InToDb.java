import java.io.File;
import java.sql.*;

public class InToDb {

    public static void main(String[] args) {
        System.out.println("Start in2db...");
        ConfIni confIni = new ConfIni();
        Connection con = null;

        try {
            con = DriverManager.getConnection(confIni.getUrl(), confIni.getUsername(), confIni.getPassword());
            if (con != null) {
                System.out.println("Connected to the DataBase.");
            }
            //Statement stm = con.createStatement();
            //ResultSet rsl = stm.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null ) {
                try {
                    con.close();
                    System.out.println("Сlose the connection.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

