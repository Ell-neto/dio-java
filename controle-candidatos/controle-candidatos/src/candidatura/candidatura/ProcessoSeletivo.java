package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Júnior", "Lan", "Paula", "Roberta", "Layne", "Ana", "Jonas", "Henrique", "Cida",
                "Lucas" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        ArrayList<String> candidatosAprovados = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "O(A) candidato(a) " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a).");
                candidatosAprovados.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
        System.out.println("Lista de candidatos aprovados:");
        for (String candidatoAprovado : candidatosAprovados) {
            if (candidatoAprovado != null) {
                System.out.println(candidatoAprovado);
            }
        }
        for (String candidato : candidatosAprovados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!");
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println(
                    "Conseguimos contato com o(a) " + candidato + " na " + tentativasRealizadas + " tentativa.");
        else
            System.out.println("Não conseguimos contato com o(a) " + candidato
                    + ", número máximo foram de " + tentativasRealizadas + " tentativas.");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1600, 2300);
    }

}
