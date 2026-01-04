package service;
import model.*;

public class StockService {

    private Stock stock;

    public StockService(Stock stock) {
        this.stock = stock;
    }

    public void adicionarItem(ItemMenu item, int quantidade) {
        stock.adicionarItem(item, quantidade);
    }

    public void consumirItem(ItemMenu item, int quantidade) {
        int disponivel = stock.getQuantidade(item);
        if (disponivel < quantidade) {
            throw new IllegalStateException("Stock insuficiente");
        }
        stock.atualizarStock(item, quantidade);
    }

    public int consultarQuantidade(ItemMenu item) {
        return stock.getQuantidade(item);
    }
}
