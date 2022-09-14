package br.org.serratec.aula12JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDao {
    private Connection connection;
    
    public ClienteDao() {
        connection = new ConnectionFactory().getConnection();
    }

    public void inserirCliente(Cliente cliente) {
        try {
            String sql = "insert into cliente (nome,telefone,email) values(?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Não foi possível gravar o registro");
        }
    }
}
