package model;

public class Conta {

    private int contacc;
    private int agencia;
    private double valor;

    public Conta(int contacc, int agencia, double valor) {
        this.contacc = contacc;
        this.agencia = agencia;
        this.valor = valor;
    }

    public int getConta() {
        return contacc;
    }

    public void setConta(int contacc) {
        this.contacc = contacc;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getValor() {
        return valor;
    }

    public double setValor(double valor) {
        this.valor = valor;
        return valor;
    }

    public double saca(double valor) {
        double saque;
           return setValor(valor);
    }
}
