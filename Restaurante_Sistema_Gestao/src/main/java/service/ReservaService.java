package service;
import model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservaService {

    private List<Reserva> reservas = new ArrayList<>();

    public Reserva criarReserva(LocalDateTime dataHora, int numeroPessoas, Mesa mesa, Cliente cliente) {
        Reserva reserva = new Reserva(dataHora, numeroPessoas, mesa);
        reservas.add(reserva);
        cliente.adicionarReserva(reserva);
        return reserva;
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
