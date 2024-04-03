//classe filha de conta 
package com.seubanco.model;
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    //construtor
    public ContaCorrente(String titular, int numero, String agencia, double saldo,String tipo, double limiteChequeEspecial) {
        super(titular, numero, agencia, saldo, tipo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    //Sobreposição de atributos
    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limiteChequeEspecial) {
            setSaldo(getSaldo() - valor); 
            return true;
        }
        return false;
    }

    //Métodos específicos da classe
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //Sobreposição
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + getTitular() + '\'' +
                ", numero=" + getNumero() +
                ", agencia='" + getAgencia() + '\'' +
                ", saldo=" + getSaldo() +
                ", tipo='" + getTipo() + '\'' +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

}
