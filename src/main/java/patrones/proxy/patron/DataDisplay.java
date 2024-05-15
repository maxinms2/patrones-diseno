package patrones.proxy.patron;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataDisplay {
    public static void main(String[] args) {
        UserDataProvider provider = new UserDataProxy();

        try (ResultSet users = provider.getUsers()) {
            while (users.next()) {
                System.out.println("User: " + users.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

