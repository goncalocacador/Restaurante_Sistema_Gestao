package model;

public class Cozinheiro extends Funcionario {

    public Cozinheiro(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    public void atualizarEstadoPedido(Pedido pedido, EstadoPedido estado) {
        pedido.atualizarEstado(estado);
    }
}
