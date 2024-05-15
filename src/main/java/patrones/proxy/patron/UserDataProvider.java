package patrones.proxy.patron;

import java.sql.ResultSet;
import java.sql.SQLException;

interface UserDataProvider {
    ResultSet getUsers() throws SQLException;
}

