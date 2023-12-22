package high_performance_java_persistence_book;

import java.sql.*;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        //props.setProperty("ssl", "true");
        try {
            Connection connection = DriverManager.getConnection(url, props);
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into just_test_table2(comment) values (?)",
                            Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, "comment1");
            int i = preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("id = " + rs.getLong(1));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
