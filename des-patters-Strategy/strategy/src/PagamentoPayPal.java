public class PagamentoPayPal implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com PayPal: $" + valor);
    }
}