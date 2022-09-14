package br.org.serratec.aula12JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
    private String usuario = "postgres";
    private String senha = "1234";
    private Connection Connection;

    public Connection getConnection() {
        try {
            System.out.println("Conectando ao banco de dados!");
            Connection = DriverManager.getConnection(urlConexao, usuario, senha);
            if(Connection != null){
                System.out.println("Conectado");
            } else {
                System.out.println("Não possível a conexão");
            }
        } catch (SQLException e) {
            System.out.println("Erro: Drive não encontrado!");
        }
        return Connection;
    }

}
