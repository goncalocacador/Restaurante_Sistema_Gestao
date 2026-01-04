package model;

import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime dataHora;
    private int numeroPessoas;
    private Mesa mesa;

    public Reserva(LocalDateTime dataHora, int numeroPessoas, Mesa mesa) {
        this.dataHora = dataHora;
        this.numeroPessoas = numeroPessoas;
        this.mesa = mesa;
    }

    public Mesa getMesa() {
        return mesa;
    }
}
