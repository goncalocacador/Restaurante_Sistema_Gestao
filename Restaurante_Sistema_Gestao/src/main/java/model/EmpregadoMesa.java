package model;

public class EmpregadoMesa extends Funcionario {

    public EmpregadoMesa(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    public Pedido criarPedido(Mesa mesa) {
        return new Pedido(mesa);
    }
}
