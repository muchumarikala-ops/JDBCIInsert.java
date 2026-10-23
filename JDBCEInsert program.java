import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "your_password";

        String createTable =
            "CREATE TABLE IF NOT EXISTS students (" +
            "id INT PRIMARY KEY, " +
            "name VARCHAR(50), " +
            "course VARCHAR(50))";

        String insertSQL =
            "INSERT INTO students (id, name, course) " +
            "VALUES (?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con =
                     DriverManager.getConnection(url, username, password);
                 Statement st = con.createStatement()) {

                st.executeUpdate("CREATE DATABASE IF NOT EXISTS mydatabase");
                st.executeUpdate("USE mydatabase");
                st.executeUpdate(createTable);

                try (PreparedStatement ps =
                         con.prepareStatement(insertSQL)) {

                    ps.setInt(1, 101);
                    ps.setString(2, "Ravi");
                    ps.setString(3, "Java");
                    int rows = ps.executeUpdate();

                    System.out.println(
                        rows + " student record inserted successfully.");

                    ps.setInt(1, 102);
                    ps.setString(2, "Sita");
                    ps.setString(3, "Python");
                    rows = ps.executeUpdate();

                    System.out.println(
                        rows + " student record inserted successfully.");
                }

                System.out.println("Database operation completed.");

            }
        } catch (ClassNotFoundException e) {
            System.out.println(
                "MySQL JDBC driver not found. Add MySQL Connector/J.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
