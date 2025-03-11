public class FormatadorDeCep {
    public static void main(String[] args) {
        String cep = "65604840";
        try {
            System.out.println(formatarCep(cep));
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "CEP formatado: " + cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}
