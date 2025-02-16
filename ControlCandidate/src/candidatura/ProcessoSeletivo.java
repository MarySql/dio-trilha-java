package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] selecionados = selecaoCandidatos(); 
        imprimirSelecionados(selecionados); 

       
        for (String candidato : selecionados) {
            if (candidato != null) {
                entrandoEmContato(candidato);
            }
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.println("\n📞 Tentando contato com " + candidato + "...");

        do {
            atendeu = atender(); // Simula se o candidato atendeu ou não
            continuarTentando = !atendeu;

            if (continuarTentando) {
                System.out.println("❌ Tentativa " + tentativaRealizada + " falhou...");
                tentativaRealizada++;
            } else {
                System.out.println("✅ Contato realizado com sucesso com " + candidato + "!");
            }
        } while (continuarTentando && tentativaRealizada < 3);

        if (!atendeu) {
            System.out.println("⚠ Não foi possível contato com " + candidato + " após 3 tentativas.");
        }
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    static void imprimirSelecionados(String[] candidatos) {
        System.out.println("\n📌 Lista de Candidatos Selecionados:");
        for (String candidato : candidatos) {
            if (candidato != null) { 
                System.out.println("➡ " + candidato);
            }
        }
    }

    static String[] selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "JEZEBEL",
                "RAFAELA", "DANIELE" };
        String[] selecionados = new String[5]; // Armazena os 5 candidatos aprovados
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("📌 O candidato " + candidato + " solicitou salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("✅ " + candidato + " foi selecionado para a vaga.");
                selecionados[candidatosSelecionados] = candidato; 
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        return selecionados; // Retorna os candidatos selecionados
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("📞 Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("💬 Oferecer contra proposta ao candidato.");
        } else {
            System.out.println("⏳ Aguardando resultado dos demais candidatos...");
        }
    }
}
