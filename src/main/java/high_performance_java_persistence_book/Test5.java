package high_performance_java_persistence_book;

import java.sql.*;
import java.util.Properties;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        long begin = System.currentTimeMillis();

        String query = "select * from just_test_table2";

        //props.setProperty("ssl", "true");
        try (Connection connection = DriverManager.getConnection(url, props)) {

            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            System.out.println(rs.getInt(1));
            rs.updateInt(1, new Random().nextInt());
            rs.updateRow();
            System.out.println(rs.getInt(1));
            System.out.println("=====================");
            System.out.println(System.currentTimeMillis() - begin);

            /*while (rs.next()) {
                System.out.println(rs.getLong(1) + "->" + rs.getString(2));
            }

            Thread.sleep(20000);
            System.out.println("==================================================");
            stmt.setFetchSize(100);
            rs.refreshRow();
            while (rs.next()) {
                System.out.println(rs.getLong(1) + "->" + rs.getString(2));
            }*/


        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
}
