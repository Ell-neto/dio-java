package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProdutos = new CadastroProduto();

        cadastroProdutos.adicionarProduto(1L, "Produto 4", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 8", 20d, 15);
        cadastroProdutos.adicionarProduto(1L, "Produto 69", 10d, 27);
        cadastroProdutos.adicionarProduto(8L, "Produto 11", 5d, 9);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
