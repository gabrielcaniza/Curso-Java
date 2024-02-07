package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import conexao.DbException;
import conexao.DB;

public class program {

    public static void main(String[] args) {

        // Declaração das variáveis de conexão e declaração de Statement
        Connection conn = null;
        Statement st = null;
        try {
            // Obtém uma conexão com o banco de dados
            conn = DB.getConnection();

            // Desativa o modo de confirmação automática de transações
            conn.setAutoCommit(false);

            // Cria um objeto Statement para execução de comandos SQL
            st = conn.createStatement();

            // Executa uma atualização no banco de dados (UPDATE)
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            // Executa outra atualização no banco de dados (UPDATE)
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            // Confirma a transação
            conn.commit();

            // Exibe o número de linhas afetadas pela primeira e segunda atualização
            System.out.println("rows1 = " + rows1);
            System.out.println("rows2 = " + rows2);
        } catch (SQLException e) {
            try {
                // Em caso de erro, tenta realizar o rollback da transação
                if (conn != null) {
                    conn.rollback();
                }
                // Lança uma exceção personalizada indicando que a transação foi revertida
                throw new DbException("Transação revertida! Causada por: " + e.getMessage());
            } catch (SQLException e1) {
                // Se ocorrer um erro ao tentar realizar o rollback, lança uma exceção
                // personalizada
                throw new DbException("Erro ao tentar reverter a transação! Causada por: " + e1.getMessage());
            }
        } finally {
            // Fecha o Statement
            DB.Closestatement(st);
            // Fecha a conexão com o banco de dados
            DB.closeConnection();
        }
    }
}
