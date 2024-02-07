package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    //Inicio do login e senha no my sql
    private static final String url = "jdbc:mysql://localhost:3306/coursejdbc";
    private static final String user = "root";
    private static final String password = "Camaro@123";
    //fim do login e conexao

    // comando pra iniciar conexão com o banco de dados
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter a conexão com o banco de dados.", e);
        }
    }

    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados.", e);
        }
    }

    public static void Closestatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao fechar o Statement.", e);
            }
        }
    }

    public static void CloseResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao fechar o ResultSet.", e);
            }
        }
    }

}
