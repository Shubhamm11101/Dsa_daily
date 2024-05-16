
    import java.sql.*;

public class CRUDApplication {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String JDBC_USER = "ShubhamBhardwaj007";
    private static final String JDBC_PASSWORD = "Shubham@2003";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    // Method to establish a database connection
    public static void connect() {
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to close the database connection
    public static void close() {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to create a new person
    public static void createPerson(String name, int age) {
        connect();
        try {
            String query = "INSERT INTO person (name, age) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Person created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    // Method to read all persons
    public static void readAllPersons() {
        connect();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Name: " + resultSet.getString("name") +
                        ", Age: " + resultSet.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    // Method to update a person by ID
    public static void updatePerson(int id, String newName, int newAge) {
        connect();
        try {
            String query = "UPDATE person SET name=?, age=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, newAge);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Person updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    // Method to delete a person by ID
    public static void deletePerson(int id) {
        connect();
        try {
            String query = "DELETE FROM person WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Person deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Create a new person
        createPerson("John Doe", 30);

        // Read all persons
        readAllPersons();

        // Update a person
        updatePerson(1, "Jane Smith", 35);

        // Read all persons after update
        readAllPersons();

        // Delete a person
        deletePerson(1);

        // Read all persons after delete
        readAllPersons();
    }
}


