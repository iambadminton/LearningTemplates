package high_performance_java_persistence_book;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test7 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");

        //props.setProperty("ssl", "true");
        try (Connection connection = DriverManager.getConnection(url, props)) {
            System.out.println("autocommit = " + connection.getAutoCommit());
            //connection.setAutoCommit(false);
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("SupportBatchUpdates = " + metaData.supportsBatchUpdates());
            System.out.println("default transaction isolation = "
                    + metaData.getDefaultTransactionIsolation());

            connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
