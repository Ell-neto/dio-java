package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(
                "Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 13);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2423);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 13);

        System.out.println(
                "Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1123);
        System.out.println(
                "Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

    }
}