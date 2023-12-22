package high_performance_java_persistence_book;

import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.function.Consumer;

/* пример принципа единственной ответственности для DAO */
public class TestInsertBlob {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost/highperformancejavapersistence";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123");

        final String FILE_PATH_IN = "D:\\images\\boy.png";
        final String FILE_PATH_OUT = "D:\\images\\new_boy.png";

        try(Connection conn = DriverManager.getConnection(url, props)) {
            conn.setAutoCommit(false);
            final String sql = "INSERT INTO person(first_name, last_name, photo) values (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "Tom");
            stmt.setString(2, "Eagar");
            InputStream inputStream = new FileInputStream(new File(FILE_PATH_IN));
            stmt.setBinaryStream(3, inputStream);

            int row = stmt.executeUpdate();
            if(row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(Connection conn = DriverManager.getConnection(url, props)) {
            final String sql = "select photo from person where person_id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,1);

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                byte[] bytes = rs.getBytes(1);
                OutputStream out = new FileOutputStream(new File(FILE_PATH_OUT));
                out.write(bytes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
