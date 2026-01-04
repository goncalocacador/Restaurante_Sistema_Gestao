import static org.junit.jupiter.api.Assertions.*;
import model.*;
import service.PagamentoService;
import org.junit.jupiter.api.Test;

public class PagamentoServiceTest {

    // TC-16 Gerar fatura
    @Test
    void gerarFatura() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.adicionarItem(new ItemMenu("Pizza",10,true));
        PagamentoService service = new PagamentoService();
        Fatura fatura = service.gerarFatura(pedido);
        assertEquals(10, fatura.getTotal());
    }

    // TC-17 Registar pagamento válido
    @Test
    void pagamentoValido() {
        Pagamento pagamento = new Pagamento("MBWay");
        assertTrue(pagamento.processarPagamento(10));
    }

    // TC-18 Pagamento inválido
    @Test
    void pagamentoInvalido() {
        Pagamento pagamento = new Pagamento("MBWay");
        assertFalse(pagamento.processarPagamento(0));
    }

    // TC-19 Calcular total
    @Test
    void calcularTotalPedido() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.adicionarItem(new ItemMenu("Pizza",10,true));
        pedido.adicionarItem(new ItemMenu("Sumo",2,true));
        assertEquals(12, pedido.calcularTotal());
    }

    // TC-20 Pagamento com fatura
    @Test
    void pagamentoComFatura() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.adicionarItem(new ItemMenu("Pizza",10,true));
        PagamentoService service = new PagamentoService();
        assertTrue(service.registarPagamento(service.gerarFatura(pedido), new Pagamento("Cartão")));
    }
}
