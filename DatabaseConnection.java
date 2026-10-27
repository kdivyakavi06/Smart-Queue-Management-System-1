import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() throws Exception {

        String url = "jdbc:mysql://localhost:3306/queue_db";
        String user = "root";
        String password = "Divya@2026#Mysql";

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(url, user, password);
    }
}