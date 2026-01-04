package service;
import model.ItemMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuService {

    private List<ItemMenu> menu = new ArrayList<>();

    public void adicionarItemMenu(ItemMenu item) {
        menu.add(item);
    }

    public void removerItemMenu(ItemMenu item) {
        menu.remove(item);
    }

    public List<ItemMenu> listarMenu() {
        return menu;
    }
}
