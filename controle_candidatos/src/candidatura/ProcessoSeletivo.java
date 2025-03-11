package candidatura;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        for (int x = 0; x <= 9; x++) {
            System.out.println("Analisando candidato " + (x + 1) + " - " + candidatos[x]);
            analisarCandidato(valorPretendido(), candidatos[x]);
        }
        System.out.println("Número de pré-selecionados - " + preSelecionados.size());
        selecionarCandidatos(preSelecionados);       
        if (selecionados.size() < 5) {
            System.out.println("Repescagem em andamento... ");
            System.out.println("Candidatos selecionados: ");
            selecionarCandidatos(repescagem);
            ordenarCandidatos(selecionados);
        } else {
            System.out.println("Candidatos selecionados: ");
            ordenarCandidatos(selecionados);
        }
        System.out.println("Contatando candidatos selecionados...");
        contatarCanditadosSelecionados(selecionados);
        System.out.println("Candidatos contratados: ");
        ordenarCandidatos(aprovados);
    }

    // Lista de candidatos
    static String[] candidatos = {"João", "José", "Paçoca", "Maria", "Joana", "Pedro", "Paulo", 
    "Joaquim", "Joaquina", "Joaquino"};

    // Lista dos Pré-selecionados
    static HashMap<String, Double> preSelecionados = new HashMap<String, Double>();

    // Lista de repescagem
    static HashMap<String, Double> repescagem = new HashMap<String, Double>();

    // Lista de selecionados
    static HashMap<String, Double> selecionados = new HashMap<>();

    // Lista de candidatos aprovados
    static HashMap<String, Double> aprovados = new HashMap<>();
    
    // Método para gerar um valor aleatório entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    // Método para formatar o salário
    static String formatarSalario(double salario) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(salario);
    }

    // Método para analisar o candidato
    static void analisarCandidato(double salarioPretendido, String nomeCandidato) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
            preSelecionados.put(nomeCandidato, salarioPretendido);
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
            preSelecionados.put(nomeCandidato, salarioPretendido);
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            repescagem.put(nomeCandidato, salarioPretendido);
        }
    }

    // Metodo para ordenar os candidatos de acordo com a pretensão salarial
    static void ordenarCandidatos(HashMap<String, Double> selecionados) {
        selecionados.entrySet().stream().sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + " - Salário: R$ " + formatarSalario(k.getValue())));
    }

    // Método para selecionar os candidatos com menor pretensão salarial
    static void selecionarCandidatos(HashMap<String, Double> preSelecionados) {
        for (Map.Entry<String, Double> entry: preSelecionados.entrySet()) {
            String nome = entry.getKey();
            double salario = entry.getValue();
            if (selecionados.size() < 5) {
                selecionados.put(nome, salario);
            } else {
                double maiorSalarioSelecionado = Double.MIN_VALUE;
                String nomeMaiorSalarioSelecionado = "";
                
                // loop para encontrar o candidato com maior salário
                for (Map.Entry<String, Double> selecionado : selecionados.entrySet()) {
                    if (selecionado.getValue() > maiorSalarioSelecionado) {
                        maiorSalarioSelecionado = selecionado.getValue();
                        nomeMaiorSalarioSelecionado = selecionado.getKey();
                    }
                }
                if (salario < maiorSalarioSelecionado) {
                    selecionados.remove(nomeMaiorSalarioSelecionado);
                    selecionados.put(nome, salario);
                }                
            }
        }
    }
    // Gerar um número aleatorio entre 0 e 5
    static int gerarNumeroAleatorio() {
        return ThreadLocalRandom.current().nextInt(0, 6);
    }
    // Contatar os candidatos selecionados
    static void contatarCanditadosSelecionados(HashMap<String, Double> selecionados) {
        for (Map.Entry<String, Double> entry : selecionados.entrySet()) {
            for (int x = 0; x < 3; x++) {
                if (x == 0) {
                    System.out.println("Contactando " + entry.getKey());
                    }
                if (gerarNumeroAleatorio() > 2) {
                    System.out.println("Candidato não atendeu a ligação");
                    continue;
                } else if (gerarNumeroAleatorio() == 2) {
                    System.out.println("Candidato recusou a ligação");
                    break;
                } else {
                    System.out.println("Candidato atendeu a ligação");
                    if (gerarNumeroAleatorio() > 4) {
                        System.out.println("Candidato " + entry.getKey() + " recusou a proposta");
                    } else {
                        System.out.println("Candidato " + entry.getKey() + " aceitou a proposta");
                        aprovados.put(entry.getKey(), entry.getValue());
                    }
                    break;
                }
            }
        }
    }
    
}
