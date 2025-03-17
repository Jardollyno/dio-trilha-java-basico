package escola;

public class Escola {
    public static void main(String[] args) throws Exception {
        // Criando um novo objeto da classe Aluno
        Aluno aluno = new Aluno();

        // Define os valores dos atributos * funciona para atributos públicos
        //aluno.nome = "Jardel";
        //aluno.idade = 22;

        // Metódo Setter
        aluno.setNome("Jardel");
        aluno.setIdade(22);

        // Imprimir mensagemde teste no terminal * funciona para atributos públicos
        // System.out.println("O aluno " + aluno.nome + ", tem " + aluno.idade + " anos.");

        // Metódo Getter
        System.out.println("O aluno " + aluno.getNome() + ", tem " + aluno.getIdade() + " anos.");
    }
}
