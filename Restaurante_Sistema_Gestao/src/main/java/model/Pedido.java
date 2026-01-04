package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static int contador = 1;

    private int id;
    private EstadoPedido estado;
    private Mesa mesa;
    private List<ItemMenu> itens;

    public Pedido(Mesa mesa) {
        if (mesa == null) {
            throw new IllegalArgumentException("Mesa não pode ser nula");
        }
        this.id = contador++;
        this.mesa = mesa;
        this.estado = EstadoPedido.RECEBIDO;
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void adicionarItem(ItemMenu item) {
        if (!item.isDisponivel()) {
            throw new IllegalStateException("Item indisponível");
        }
        itens.add(item);
    }

    public void removerItem(ItemMenu item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemMenu::getPreco).sum();
    }

    public void atualizarEstado(EstadoPedido novoEstado) {
        this.estado = novoEstado;
    }

    public List<ItemMenu> getItens() {
        return itens;
    }

    public Mesa getMesa() {
        return mesa;
    }
}