package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.DB;
import conexao.DbIntegrityException;

public class program {

    public static void main(String[] args) {

        // comando pra iniciar conexão
        Connection conn = null;
        PreparedStatement st = null;

        try {
            // conectar com banco de dados
            conn = DB.getConnection();

            // fazer variavel receber preparedstatement e comoando para
            // deletar dados.

            st = conn.prepareStatement(
                    "DELETE FROM seller "
                            + "WHERE "
                            + "ID = ?");

            st.setInt(1, 8);
            int rowsAffected = st.executeUpdate();
            System.out.println("Done! Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.Closestatement(st);
            DB.closeConnection();
        }

    }

}
