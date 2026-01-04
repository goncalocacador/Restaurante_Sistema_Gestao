package service;
import model.Pedido;

import java.util.List;

public class RelatorioService {

    public int totalPedidos(List<Pedido> pedidos) {
        return pedidos.size();
    }

    public double totalFaturado(List<Pedido> pedidos) {
        return pedidos.stream()
                .mapToDouble(Pedido::calcularTotal)
                .sum();
    }
}
