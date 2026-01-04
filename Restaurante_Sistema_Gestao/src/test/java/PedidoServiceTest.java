import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;
import service.PedidoService;


public class PedidoServiceTest {

    // TC-01 Criar Pedido
    @Test
    void criarPedidoValido() {
        PedidoService service = new PedidoService();
        Mesa mesa = new Mesa(1, 4);
        Pedido pedido = service.criarPedido(mesa);
        assertNotNull(pedido);
    }

    // TC-02 Criar Pedido sem mesa
    @Test
    void criarPedidoSemMesa() {
        PedidoService service = new PedidoService();
        assertThrows(IllegalArgumentException.class, () -> service.criarPedido(null));
    }

    // TC-03 Adicionar item disponível
    @Test
    void adicionarItemDisponivel() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        ItemMenu item = new ItemMenu("Pizza", 10, true);
        pedido.adicionarItem(item);
        assertEquals(1, pedido.getItens().size());
    }

    // TC-04 Adicionar item indisponível
    @Test
    void adicionarItemIndisponivel() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        ItemMenu item = new ItemMenu("Pizza", 10, false);
        assertThrows(IllegalStateException.class, () -> pedido.adicionarItem(item));
    }

    // TC-05 Remover item
    @Test
    void removerItemPedido() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        ItemMenu item = new ItemMenu("Pizza", 10, true);
        pedido.adicionarItem(item);
        pedido.removerItem(item);
        assertEquals(0, pedido.getItens().size());
    }

    // TC-06 Criar pedido com vários itens
    @Test
    void pedidoComVariosItens() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.adicionarItem(new ItemMenu("Pizza", 10, true));
        pedido.adicionarItem(new ItemMenu("Sumo", 2, true));
        assertEquals(2, pedido.getItens().size());
    }

    // TC-07 Estado inicial
    @Test
    void estadoInicialPedido() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        assertEquals(EstadoPedido.RECEBIDO, pedido.getEstado());
    }

    // TC-08 Atualizar estado
    @Test
    void atualizarEstadoPedido() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        pedido.atualizarEstado(EstadoPedido.EM_PREPARACAO);
        assertEquals(EstadoPedido.EM_PREPARACAO, pedido.getEstado());
    }

    // TC-09 Estado inválido (lógico)
    @Test
    void estadoNaoNulo() {
        Pedido pedido = new Pedido(new Mesa(1,4));
        assertNotNull(pedido.getEstado());
    }

    // TC-10 Listar pedidos
    @Test
    void listarPedidos() {
        PedidoService service = new PedidoService();
        service.criarPedido(new Mesa(1,4));
        assertEquals(1, service.listarPedidos().size());
    }
}