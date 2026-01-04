import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;
import java.util.List;
import service.RelatorioService;

public class RelatorioServiceTest {

    // TC-29 Total de pedidos
    @Test
    void totalPedidos() {
        Pedido p1 = new Pedido(new Mesa(1,4));
        Pedido p2 = new Pedido(new Mesa(2,4));
        RelatorioService service = new RelatorioService();
        assertEquals(2, service.totalPedidos(List.of(p1,p2)));
    }

    // TC-30 Total faturado
    @Test
    void totalFaturado() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.adicionarItem(new ItemMenu("Pizza",10,true));
        RelatorioService service = new RelatorioService();
        assertEquals(10, service.totalFaturado(List.of(pedido)));
    }
}