package model;

public abstract class Funcionario extends Pessoa {
    protected double salario;

    public Funcionario(int id, String nome, double salario) {
        super(id, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}