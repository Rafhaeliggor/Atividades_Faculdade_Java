package Atividade_Java_3\br.com.caelum.contas.main;
import Atividade_Java_3\br.com.caelum.contas.modelo;
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaJoao = new ContaBancaria("João", 123456, 7890, 2034.20, "20/02/2024");
        contaJoao.depositar(500.00);
        contaJoao.calcularRendimentos();
        contaJoao.exibirInformacoes();  
        //testando getter 
        System.out.println("");
        System.out.println("Testando getter");
        System.out.println(contaJoao.getSaldo());
        //testando setter
        System.out.println("");
        System.out.println("Testando setter");
        contaJoao.setSaldo(50.20);
        System.out.println("Novo saldo:");
        System.out.println(contaJoao.getSaldo());
        //pegando identificador
        System.out.println("Identificaor: " + contaJoao.getIdentificador());
    }
}
