public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    public Pessoa (String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }
}
