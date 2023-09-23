package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaPessoas {

    private Map<String, Integer> agendaContatoMap;

    public AgendaPessoas() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaPessoas agendaContatos = new AgendaPessoas();

        agendaContatos.adicionarContato("Manoel", 232425);
        agendaContatos.adicionarContato("Ell", 121314);
        agendaContatos.adicionarContato("Mano", 26);
        agendaContatos.adicionarContato("Neto", 121314);
        agendaContatos.adicionarContato("Mann", 4251);
        agendaContatos.adicionarContato("Manoel", 4425);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Mano");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Mann"));
    }

}
