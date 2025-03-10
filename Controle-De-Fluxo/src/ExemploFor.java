public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 5; carneirinhos++) {
            if (carneirinhos == 1) {
                System.out.println("1 carneirinho pulou a cerca");
            } else {
                System.out.println(carneirinhos + " carneirinhos pularam a cerca");
            }
            try {
                Thread.sleep(1000); // Pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace(); // Imprime a pilha de chamadas da exceção
            }
        }
        String alunos [] = {"João, Maria, José, Ana, Pedro"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println(alunos[x]);
        }
         // Usando o for each
        for (String aluno : alunos) {// Para cada aluno em alunos
            System.out.println(aluno);
        }
    }
}

