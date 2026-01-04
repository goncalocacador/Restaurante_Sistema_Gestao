import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.*;
import service.ReservaService;
import java.time.LocalDateTime;

public class ReservaServiceTest {

    // TC-11 Criar reserva válida
    @Test
    void criarReserva() {
        ReservaService service = new ReservaService();
        Cliente cliente = new Cliente(1,"Ana");
        Reserva reserva = service.criarReserva(LocalDateTime.now(),2,new Mesa(1,4),cliente);
        assertNotNull(reserva);
    }

    // TC-12 Cancelar reserva
    @Test
    void cancelarReserva() {
        ReservaService service = new ReservaService();
        Cliente cliente = new Cliente(1,"Ana");
        Reserva reserva = service.criarReserva(LocalDateTime.now(),2,new Mesa(1,4),cliente);
        service.cancelarReserva(reserva);
        assertEquals(0, service.listarReservas().size());
    }

    // TC-13 Reserva associada ao cliente
    @Test
    void reservaAssociadaCliente() {
        ReservaService service = new ReservaService();
        Cliente cliente = new Cliente(1,"Ana");
        service.criarReserva(LocalDateTime.now(),2,new Mesa(1,4),cliente);
        assertEquals(1, cliente.getReservas().size());
    }

    // TC-14 Reserva com mesa
    @Test
    void reservaTemMesa() {
        Mesa mesa = new Mesa(1,4);
        Reserva reserva = new Reserva(LocalDateTime.now(),2,mesa);
        assertEquals(mesa, reserva.getMesa());
    }

    // TC-15 Listar reservas
    @Test
    void listarReservas() {
        ReservaService service = new ReservaService();
        service.criarReserva(LocalDateTime.now(),2,new Mesa(1,4),new Cliente(1,"Ana"));
        assertEquals(1, service.listarReservas().size());
    }
}