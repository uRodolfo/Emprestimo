package Cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ferramentas {
    private String nome;
    private String marca;
    private double custoDeAquisicao;

    // Construtor
    public Ferramentas(String nome, String marca, double custoDeAquisicao) {
        this.nome = nome;
        this.marca = marca;
        this.custoDeAquisicao = custoDeAquisicao;
    }

    // Métodos getters e setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos getters e setters para custoDeAquisicao
    public double getCustoDeAquisicao() {
        return custoDeAquisicao;
    }

    public void setCustoDeAquisicao(double custoDeAquisicao) {
        this.custoDeAquisicao = custoDeAquisicao;
    }

    // Método para inserir uma ferramenta no banco de dados

}