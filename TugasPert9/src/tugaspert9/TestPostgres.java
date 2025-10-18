/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert9;

/**
 *
 * @author RAISSA
 */
import java.sql.*;

public class TestPostgres {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/pbo_pert7";
        String user = "postgres";
        String password = "ABCDE12345";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi sukses!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
