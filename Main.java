package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "YOUR_PASSWORD";

        try {
            Connection con =
                    DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}






