package service;
import model.*;

public class PagamentoService {

    public Fatura gerarFatura(Pedido pedido) {
        return new Fatura(pedido);
    }

    public boolean registarPagamento(Fatura fatura, Pagamento pagamento) {
        return pagamento.processarPagamento(fatura.getTotal());
    }
}
