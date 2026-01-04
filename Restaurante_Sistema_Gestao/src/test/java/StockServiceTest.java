import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;
import service.StockService;

public class StockServiceTest {

    // TC-21 Adicionar item ao stock
    @Test
    void adicionarStock() {
        StockService service = new StockService(new Stock());
        ItemMenu item = new ItemMenu("Pizza",10,true);
        service.adicionarItem(item,10);
        assertEquals(10, service.consultarQuantidade(item));
    }

    // TC-22 Consumir stock
    @Test
    void consumirStock() {
        StockService service = new StockService(new Stock());
        ItemMenu item = new ItemMenu("Pizza",10,true);
        service.adicionarItem(item,10);
        service.consumirItem(item,2);
        assertEquals(8, service.consultarQuantidade(item));
    }

    // TC-23 Stock insuficiente
    @Test
    void stockInsuficiente() {
        StockService service = new StockService(new Stock());
        ItemMenu item = new ItemMenu("Pizza",10,true);
        service.adicionarItem(item,1);
        assertThrows(IllegalStateException.class, () -> service.consumirItem(item,2));
    }

    // TC-24 Consultar stock
    @Test
    void consultarStock() {
        StockService service = new StockService(new Stock());
        assertEquals(0, service.consultarQuantidade(new ItemMenu("Pizza",10,true)));
    }

    // TC-25 Atualizar stock
    @Test
    void atualizarStock() {
        Stock stock = new Stock();
        StockService service = new StockService(stock);
        ItemMenu item = new ItemMenu("Pizza",10,true);
        service.adicionarItem(item,5);
        service.consumirItem(item,5);
        assertEquals(0, service.consultarQuantidade(item));
    }
}
