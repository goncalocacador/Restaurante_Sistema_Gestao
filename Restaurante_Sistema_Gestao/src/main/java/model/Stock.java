package model;

import java.util.HashMap;
import java.util.Map;

public class Stock {

    private Map<ItemMenu, Integer> itens = new HashMap<>();

    public void adicionarItem(ItemMenu item, int quantidade) {
        itens.put(item, quantidade);
    }

    public void atualizarStock(ItemMenu item, int quantidade) {
        itens.put(item, itens.get(item) - quantidade);
    }

    public int getQuantidade(ItemMenu item) {
        return itens.getOrDefault(item, 0);
    }
}
