public class Main {
    public static void main(String[] args) {
        PagamentoContexto contexto = new PagamentoContexto();
        contexto.setEstrategia(new PagamentoCartaoCredito());
        contexto.realizarPagamento(100.0);

        contexto.setEstrategia(new PagamentoPayPal());
        contexto.realizarPagamento(50.0);
    }
}
