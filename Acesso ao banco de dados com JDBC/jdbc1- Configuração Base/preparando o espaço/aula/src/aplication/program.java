package aplication;

import java.sql.Connection;

import conexao.conexao;

public class program {

    public static void main(String[] args) {

        Connection conn = conexao.getConnection();

        conexao.closeConnection();

        
    }

}
