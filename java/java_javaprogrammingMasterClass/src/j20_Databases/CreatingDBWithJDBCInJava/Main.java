package j20_Databases.CreatingDBWithJDBCInJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connectionString =
                    DriverManager.getConnection("jdbc:sqlite:/C:/Users/ASUS/Documents/java/java_javaprogrammingMasterClass/src/j20_Databases/CreatingDBWithJDBCInJava/testjava.db");
        } catch (SQLException e) {
            System.out.println("something went wrong: " + e.getMessage());
        }
    }
}
