import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;
import service.MenuService;

public class MenuServiceTest {

    // TC-26 Adicionar item ao menu
    @Test
    void adicionarItemMenu() {
        MenuService service = new MenuService();
        service.adicionarItemMenu(new ItemMenu("Pizza",10,true));
        assertEquals(1, service.listarMenu().size());
    }

    // TC-27 Remover item do menu
    @Test
    void removerItemMenu() {
        MenuService service = new MenuService();
        ItemMenu item = new ItemMenu("Pizza",10,true);
        service.adicionarItemMenu(item);
        service.removerItemMenu(item);
        assertEquals(0, service.listarMenu().size());
    }

    // TC-28 Listar menu
    @Test
    void listarMenu() {
        MenuService service = new MenuService();
        assertNotNull(service.listarMenu());
    }
}
