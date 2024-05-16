package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void Conexao() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/standard", "root", "root");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM Cliente");

            // Iterando sobre os resultados do ResultSet
            while (rsCliente.next()) {
                int id = rsCliente.getInt("id");
                String nome = rsCliente.getString("nomes");
                String numeroTelefone = rsCliente.getString("numero_telefone");
                
                // Exibindo os dados
                System.out.println("ID: " + id + ", Nome: " + nome + ", Número de Telefone: " + numeroTelefone);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver JDBC não encontrado");
        } catch (SQLException ex) {
            System.out.println("Erro ao executar a consulta SQL: " + ex.getMessage());
        } finally {
            // Bloco finally para garantir que a conexão seja fechada, caso tenha sido aberta
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
    }
}
