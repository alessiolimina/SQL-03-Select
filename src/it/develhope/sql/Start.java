package it.develhope.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a Tester class
 * @author alessiolimina
 */
public class Start {
    public static void main(String[] args) throws SQLException {

        /** Creating a null connection conn */
        Connection conn = null;

        /** Creating a try/catch statement */
        try {
            /** Getting the connection 'conn' using Driver Manager and 3 parameters:
             * @param url is the url of the database newdb
             * @param user is the MySQL developer user
             * @param password is the password used for MySQL developer account
             */
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "**********");

            /** Creating a new 'conn' statement using Statement */
            Statement statement = conn.createStatement();

             /** Using a String 'selectNameSurname' as a query,
             * Selecting all names and surnames from table 'students' in 'newdb' database */
            String selectNameSurname = "SELECT first_name, last_name FROM students;";

            /** Execute the query using ResultSet */
            ResultSet rs = statement.executeQuery(selectNameSurname);

            /** Using the ResultSet next() method to move the pointer from ResultSet object's current position to the next row */
            System.out.println("Printing first row:");
            rs.next();

            /** Getting the first name value from 'first_name' column using ResultSet method getString(), amd printing it */
            String name1 = rs.getString("first_name");
            System.out.println("name 1: " + name1);

            /** Getting the first surname value from 'last_name' column using ResultSet method getString(), without printing it */
            String surname1 = rs.getString("last_name");
            System.out.println("--------------------");

            /** Using again the ResultSet next() method */
            System.out.println("Printing second row:");
            rs.next();

            /** Getting the second name value from 'first_name' column using ResultSet method getString(), amd printing it */
            String name2 = rs.getString("first_name");
            System.out.println("name 2: " + name2);

            /** Getting the second surname value from 'last_name' column using ResultSet method getString(), without printing it */
            String surname2 = rs.getString("last_name");
            System.out.println("--------------------");

            /** Again the ResultSet next() method */
            System.out.println("Printing third row:");
            rs.next();

            /** Getting the third name value from 'first_name' column using ResultSet method getString(), amd printing it */
            String name3 = rs.getString("first_name");
            System.out.println("name 3: " + name3);

            /** Getting the third surname value from 'last_name' column using ResultSet method getString(), without printing it */
            String surname3 = rs.getString("last_name");
            System.out.println("--------------------");

            /** Repeating the ResultSet next() method: */
            System.out.println("Printing fourth row:");
            rs.next();

            /** Getting the fourth name value from 'first_name' column using ResultSet method getString(), amd printing it */
            String name4 = rs.getString("first_name");
            System.out.println("name 4: " + name4);

            /** Getting the fourth surname value from 'last_name' column using ResultSet method getString(), without printing it */
            String surname4 = rs.getString("last_name");
            System.out.println("--------------------");

            /** Creating an empty List of Strings called 'surnames' */
            List<String> surnames = new ArrayList<>();

            /** Adding all the surnames obtained by using the ResultSet getString() method */
            surnames.add(surname1);
            surnames.add(surname2);
            surnames.add(surname3);
            surnames.add(surname4);

            /** Printing the surnames' list */
            System.out.println("This is the surnames' list: " + surnames);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}





