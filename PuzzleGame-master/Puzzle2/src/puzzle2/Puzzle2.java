package puzzle2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Puzzle2 {

   static Welcome WC = new Welcome();
        // TODO code application logic here
        static final String DB_URL = "jdbc:postgresql://localhost:5432/score2";
        static final String USER = "postgres";
        static final String PASS = "1234567";

        public static void main(String[] args) {
            WC.setVisible(true);
            System.out.println("Testing connection to PostgreSQL JDBC");

            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
                e.printStackTrace();
                return;
            }

            System.out.println("PostgreSQL JDBC Driver successfully connected");
            Connection connection = null;

            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);

            } catch (SQLException e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
                return;
            }
        }
    }
    

