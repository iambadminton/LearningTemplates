package high_performance_java_persistence_book;

import javax.sql.RowSet;
import java.sql.*;
import java.util.Properties;

/**
 * Тест использоваения savepoint
 */

public class Test11 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        //props.setProperty("ssl", "true");
        try (Connection connection = DriverManager.getConnection(url, props)) {

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into just_test_table2(comment) values(?)",
                            Statement.RETURN_GENERATED_KEYS, ResultSet.TYPE_SCROLL_INSENSITIVE);
            preparedStatement.setString(1, "***COMMENT1***");
            int count = preparedStatement.executeUpdate();

            Savepoint save = connection.setSavepoint();

            PreparedStatement preparedStatement1 =
                    connection.prepareStatement("insert into just_test_table2(comment) values(?)",
                            Statement.RETURN_GENERATED_KEYS, ResultSet.TYPE_SCROLL_INSENSITIVE);
            preparedStatement1.setString(1, "***COMMENT2***");
            int count1  = preparedStatement1.executeUpdate();
            connection.rollback(save);
            connection.commit();




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
