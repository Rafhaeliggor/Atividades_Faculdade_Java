//Conta de investimento
package com.seubanco.model;

//Criando classe
public class ContaInvestimento extends Conta {
    private double carteiraInvestimentos;

    //Construtor da classe
    public ContaInvestimento(String titular, int numero, String agencia, double saldo,String tipo, double carteiraInvestimentos) {
        super(titular, numero, agencia, saldo, tipo);
        this.carteiraInvestimentos = carteiraInvestimentos;
    }

    //Métodos para classe de investimento
    public void investir(double valor) {
        this.carteiraInvestimentos += valor; 
    }

    public void desinvestir(double valor) {
        this.carteiraInvestimentos -= valor;

    }

    public double getCarteiraInvestimentos() {
        return carteiraInvestimentos;
    }

    public void setCarteiraInvestimentos(double carteiraInvestimentos) {
        this.carteiraInvestimentos = carteiraInvestimentos;
    }

    //Sobreposição de método
    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", tipo='" + getTipo() + '\'' +
                ", carteiraInvestimentos=" + carteiraInvestimentos +
                '}';
    }

}
