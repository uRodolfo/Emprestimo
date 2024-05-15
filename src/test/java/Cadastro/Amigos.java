package Cadastro;

public class Amigos {
    private String nome;
    private String telefone;

    // Construtor
    public Amigos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método getter para o nome
    public String getNome() {
        return nome;
    }

    // Método setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o telefone
    public String getTelefone() {
        return telefone;
    }

    // Método setter para o telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}