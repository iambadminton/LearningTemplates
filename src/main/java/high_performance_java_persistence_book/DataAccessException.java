package high_performance_java_persistence_book;

import java.sql.SQLException;

public class DataAccessException extends Exception {
    public DataAccessException(Exception e) {
        System.out.println(e.getMessage());
    }
}
