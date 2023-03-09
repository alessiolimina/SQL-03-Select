package it.develhope.sql;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "developerpass1");
        Statement statement = conn.createStatement();
        String selectNameSurname = "SELECT first_name, last_name FROM students;";
        ResultSet rs = statement.executeQuery(selectNameSurname);

        System.out.println("Printing first row:");
        rs.next();
        String name1 = rs.getString("first_name");
        System.out.println("name:" + name1);
        String surname1 = rs.getString("last_name");
        System.out.println("--------------------");

        System.out.println("Printing second row:");
        rs.next();
        String name2 = rs.getString("first_name");
        System.out.println("name:" + name2);
        String surname2 = rs.getString("last_name");
        System.out.println("--------------------");

        System.out.println("Printing third row:");
        rs.next();
        String name3 = rs.getString("first_name");
        System.out.println("name:" + name3);
        String surname3 = rs.getString("last_name");
        System.out.println("--------------------");

        System.out.println("Printing fourth row:");
        rs.next();
        String name4 = rs.getString("first_name");
        System.out.println("name:" + name4);
        String surname4 = rs.getString("last_name");
        System.out.println("--------------------");

        List<String> surnames = new ArrayList<>();
        surnames.add(surname1);
        surnames.add(surname2);
        surnames.add(surname3);
        surnames.add(surname4);

        System.out.println("This is the surnames' list:" + surnames);
        }

    }




