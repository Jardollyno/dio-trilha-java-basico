public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int numero1 = 10;
        int numero2 = 10;

        String resultado = numero1==numero2 ? "Iguais" : "Diferentes";

        System.out.println(resultado);

        // .equals compara o conteúdo de dois objetos:
        String nome1 = "João";
        String nome2 = "João";

        String resultado2 = nome1.equals(nome2) ? "Iguais" : "Diferentes";

        System.out.println(resultado2);
        
        // && objeto lógico E
        // || objeto lógico OU

    }
}
