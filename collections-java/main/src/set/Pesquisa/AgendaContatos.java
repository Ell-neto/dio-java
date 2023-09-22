package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Manoel", 123456);
        agendaContatos.adicionarContato("Manoel", 3444);
        agendaContatos.adicionarContato("Manoel Neto", 16422);
        agendaContatos.adicionarContato("Manoel F", 56);
        agendaContatos.adicionarContato("Manel", 56);

        // agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("Manoel"));

        System.out.println("Contato atualizado: " +
                agendaContatos.atualizarNumeroContato("Manoel Neto", 234232));

        agendaContatos.exibirContato();

    }

}
