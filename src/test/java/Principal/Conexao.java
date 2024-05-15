package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void consultarClientes() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/standard", "root", "root");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver JDBC não encontrado");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
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
