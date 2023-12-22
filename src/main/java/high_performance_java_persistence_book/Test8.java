package high_performance_java_persistence_book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.function.Consumer;

/* пример принципа единственной ответственности для DAO */
public class Test8 {

    public static void main(String[] args) throws Exception {
        Test8 test8 = new Test8();
        long fromAccountId = 1;
        long toAccountId = 2;
        test8.transact((Connection connection) -> {
            try(PreparedStatement transferStatement = connection.prepareStatement(
                    "UPDATE account SET balance = ? WHERE id = ?"
            )) {
                transferStatement.setLong(1, Math.negateExact(50));
                transferStatement.setLong(2, fromAccountId);
                transferStatement.executeUpdate();

                transferStatement.setLong(1, Math.negateExact(50));
                transferStatement.setLong(2, toAccountId);
                transferStatement.executeUpdate();

            } catch (Exception e) {
                //throw new DataAccessException(e);
            }
        });
    }

    public void transact(Consumer<Connection> callback) throws DataAccessException {
        Connection connection = null;
        try {
            callback.accept(connection);
            connection.commit();
        } catch (Exception e) {
            if(connection != null) {
                try{
                    connection.rollback();
                } catch(SQLException ex) {
                    throw new DataAccessException(e);
                }
            }
            throw(e instanceof DataAccessException ? (DataAccessException) e: new DataAccessException(e));
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new DataAccessException(e);
                }
            }
        }
    }
}
