package patrones.proxy.patron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class RealUserDataProvider implements UserDataProvider {
    public ResultSet getUsers() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "user", "password");
        PreparedStatement statement = (PreparedStatement) connection.createStatement();
        return statement.executeQuery("SELECT * FROM users");
    }
}

