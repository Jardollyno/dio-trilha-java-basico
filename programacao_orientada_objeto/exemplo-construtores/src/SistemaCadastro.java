public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "12345678910");

        marcos.setEndereco("Rua lá de baixo, 53 - Catapiumba");

        System.out.println("Nome da pessoa: " + marcos.getNome() + " o seu cpf é " 
        + marcos.getCpf() + " e o seu endereço é " + marcos.getEndereco());
    }
}
