package patrones.proxy.patron;

import java.sql.ResultSet;
import java.sql.SQLException;

class UserDataProxy implements UserDataProvider {
    private RealUserDataProvider realProvider;

    public UserDataProxy() {
        this.realProvider = new RealUserDataProvider();
    }

    public ResultSet getUsers() throws SQLException {
        // Aquí se pueden agregar controles, caché, etc.
        return realProvider.getUsers();
    }
}
