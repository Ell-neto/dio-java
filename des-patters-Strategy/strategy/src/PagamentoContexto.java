public class PagamentoContexto {
    private PagamentoStrategy estrategia;

    public void setEstrategia(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        estrategia.realizarPagamento(valor);
    }
}