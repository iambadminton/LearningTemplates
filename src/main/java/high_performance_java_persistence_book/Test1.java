package high_performance_java_persistence_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");
        //props.setProperty("ssl", "true");
        try {
            Connection connection = DriverManager.getConnection(url, props);
            Statement statement = connection.createStatement();
            statement.addBatch("insert into just_test_table(id, comment) values (2, 'comment2')");
            statement.addBatch("insert into just_test_table(id, comment) values (3, 'comment3')");

            

            //statement.getResultSetConcurrency() @Todo изучить работу этого метода
            // @// TODO: 04.06.2022 изучить DatabaseMetaData и его метод supportsBatchUpdates 


            int[] updateCounts = statement.executeBatch();

            for (int i = 0; i < updateCounts.length ; i++) {
                System.out.println(updateCounts[i]);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
