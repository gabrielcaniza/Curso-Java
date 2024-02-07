package conexao.aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.conexao;

public class program {

    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = conexao.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            // rs.next enquanto existir proximo ele procura
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.Closestatement(st);
            conexao.CloseResultSet(rs);
        }

    }

}
