package br.org.serratec.aula12JDBC;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(null, "Roberta", "23232233", "r@gmail.com");
        ClienteDao clienteDao = new ClienteDao();

        clienteDao.inserirCliente(cliente);
    }
}
