package model;

public class Pagamento {
    private String metodo;

    public Pagamento(String metodo) {
        this.metodo = metodo;
    }

    public boolean processarPagamento(double valor) {
        return valor > 0;
    }
}
