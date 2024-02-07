package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.DB;

public class program {

    public static void main(String[] args) {

        // comando pra iniciar conexão
        Connection conn = null;
        PreparedStatement st = null;

        try {
            // conectar com banco de dados
            conn = DB.getConnection();

            // fazer variavel receber preparedstatement e comoando para
            // atualizar registro de dados.

            st = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE " +
                            ("DepartmentId = ?"));

            st.setDouble(1, 200.0);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.Closestatement(st);
            DB.closeConnection();
        }

    }

}
