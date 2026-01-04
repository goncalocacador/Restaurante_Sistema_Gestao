package model;

public class Fatura {
    private Pedido pedido;
    private double total;

    public Fatura(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    public double getTotal() {
        return total;
    }
}
