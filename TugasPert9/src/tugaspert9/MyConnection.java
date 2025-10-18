package tugaspert9;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection getConnection() throws Exception {
        // Driver PostgreSQL (karena pakai postgresql-42.7.3.jar)
        Class.forName("org.postgresql.Driver");
        // Ganti URL, username, password sesuai DB
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/pbo_pert7",
                "postgres",
                "ABCDE12345"
        );
    }
}
