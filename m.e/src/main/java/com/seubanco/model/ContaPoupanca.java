//Criando classe Poupançca
package com.seubanco.model;
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    //Criando classe fiha de conta
    public ContaPoupanca(String titular, int numero, String agencia, double saldo, String tipo, double taxaRendimento) {
        super(titular, numero, agencia, saldo, tipo);
        this.taxaRendimento = taxaRendimento;
    }

    //Métodos para Conta Poupançca
    public void render() {
        depositar(getSaldo() * taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    //Sobreposição de atributos específicos da classe
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", tipo='" + getTipo() + '\'' +
                ", taxaRendimento=" + taxaRendimento +
                '}';
    }
    
}
