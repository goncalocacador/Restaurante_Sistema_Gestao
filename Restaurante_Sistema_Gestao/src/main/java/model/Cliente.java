package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private List<Reserva> reservas = new ArrayList<>();

    public Cliente(int id, String nome) {
        super(id, nome);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}

