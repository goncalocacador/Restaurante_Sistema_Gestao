package service;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Mesa mesa) {
        Pedido pedido = new Pedido(mesa);
        pedidos.add(pedido);
        return pedido;
    }

    public void adicionarItem(Pedido pedido, ItemMenu item) {
        pedido.adicionarItem(item);
    }

    public void removerItem(Pedido pedido, ItemMenu item) {
        pedido.removerItem(item);
    }

    public void atualizarEstado(Pedido pedido, EstadoPedido estado) {
        pedido.atualizarEstado(estado);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}