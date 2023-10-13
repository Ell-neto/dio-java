public class PagamentoCartaoCredito implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito: $" + valor);
    }
}