package high_performance_java_persistence_book;

import java.sql.*;
import java.util.Properties;

public class Test10 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        //props.setProperty("ssl", "true");
        try {
            Connection connection = DriverManager.getConnection(url, props);

            PreparedStatement preparedStatement =
                    connection.prepareStatement("select * from just_test_table2",
                            Statement.RETURN_GENERATED_KEYS, ResultSet.TYPE_SCROLL_INSENSITIVE);
            ResultSet rs = preparedStatement.executeQuery();



            while (rs.next()) {
                System.out.println("id = " + rs.getLong(1));
            }

            rs.moveToInsertRow();
            rs.updateLong(1, -999999999);
            rs.updateString(2, "QQQQQQQQQQQQ");
            rs.insertRow();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
