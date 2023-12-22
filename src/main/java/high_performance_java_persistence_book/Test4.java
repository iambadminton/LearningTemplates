package high_performance_java_persistence_book;

import java.sql.*;
import java.util.Properties;

public class Test4 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");

        //props.setProperty("ssl", "true");
        try {
            Connection connection = DriverManager.getConnection(url, props);
            connection.setAutoCommit(false);

            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.supportsBatchUpdates());


            try(ResultSet rs = metaData.getTables(null, null, "%", null)) {
                ResultSetMetaData rsMeta = rs.getMetaData();
                int columnCount = rsMeta.getColumnCount();

                while (rs.next()) {
                    System.out.println("\n-----------------------------");
                    System.out.println(rs.getString("TABLE_NAME"));
                    System.out.println("\n-----------------------------");
                    for (int i = 1; i < columnCount; i++) {
                        String columnName = rsMeta.getColumnName(i);
                        System.out.format("%s:%s\n", columnName, rs.getString(i));

                    }


                }
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
