package Main;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Conta contaJoao = new Conta("João", 123456, 7890, 2034.20, "20/02/2024");
        Conta contaSemNome = new Conta("pedro", 3213, 7890, 500.20, "20/02/2024");
        Gerente novoGerente = new Gerente("Vitor", "13214214", 5000.00, 4, "1314");
        System.out.println(novoGerente.getBonificacao());
        System.out.println(contaJoao.getSaldo());
        System.out.println(contaSemNome.getSaldo());
    }
    
}