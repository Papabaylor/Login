import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAPI {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/filtertofork";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        // Placeholder for main method
    }

    // Method for Google login
    public boolean googleLogin(String googleToken) {
        // Placeholder for Google authentication logic
        return authenticateUser(googleToken, "google");
    }

    // Method for Apple login
    public boolean appleLogin(String appleToken) {
        // Placeholder for Apple authentication logic
        return authenticateUser(appleToken, "apple");
    }

    // Method for email login
    public boolean emailLogin(String email, String password) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to authenticate user based on token and provider
    private boolean authenticateUser(String token, String provider) {
        // Placeholder for token verification logic
        return true;
    }
}
// LoginAPI.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAPI {
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/filtertofork";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        // Placeholder for main method
    }

    // Method for Google login
    public boolean googleLogin(String googleToken) {
        // Placeholder for Google authentication logic
  public boolean googleLogin(String googleToken) {
    // Placeholder for Google authentication logic
    boolean authenticated = authenticateUser(googleToken, "google");
    if (authenticated) {
        AccountCreationAPI accountCreationAPI = new AccountCreationAPI();
        return accountCreationAPI.createIndividualAccount(googleToken);
    }
    return false;
}

public boolean appleLogin(String appleToken) {
    // Placeholder for Apple authentication logic
    boolean authenticated = authenticateUser(appleToken, "apple");
    if (authenticated) {
        AccountCreationAPI accountCreationAPI = new AccountCreationAPI();
        return accountCreationAPI.createIndividualAccount(appleToken);
    }
    return false;
}/ Method for Apple login
    public boolean appleLogin(String appleToken) {
        // Placeholder for Apple authentication logic
        return authenticateUser(appleToken, "apple");
    }

    // Common method to authenticate user
    private boolean authenticateUser(String token, String provider) {
        // Placeholder for token validation and user authentication
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM users WHERE token = ? AND provider = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, token);
            statement.setString(2, provider);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
