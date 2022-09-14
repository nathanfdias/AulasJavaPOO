package br.org.serratec.aula12JDBC;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println(connection);
    }
}
