package adressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddressBookConnection {
    /*Connecting and retrieving all entries from addressBook
     * USED TDD approach */


        public static final String URL = "jdbc:mysql://localhost:3306/addressbook_system?useSSL=false";
        public static final String USER = "root";
        public static final String PASSWORD = "";
        private static Connection connection;

        public static Connection getConnection() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
}

