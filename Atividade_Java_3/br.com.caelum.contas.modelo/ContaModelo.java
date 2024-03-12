import java.util.Random;
public class ContaModelo {
    // Atributos
    private String nome;
    private int numero;
    private int agencia;
    private double saldo;
    private String dataAbertura;
    private int identificador;

    // Construtor
    public ContaModelo(String nome, int numero, int agencia, double saldo, String dataAbertura) { 
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.identificador = gerarIdentificadorUnico();
    }

    // Métodos
    public void depositar (Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$"+ valor+ " foi adicionado a conta. Novo saldo: R$"+ saldo);
        } 
        else {
            System.out.println("Depósito inválido, insira um valor acima de R$ 0!");
        }

    }
    public void sacar (Double valor) {
        if (valor > saldo) {
            saldo = saldo - valor;
            System.out.println("Foram returados R$"+ valor);
        }
        else {
            System.out.println("Valor inválido");
        }

    }
    
    public void calcularRendimentos () {
        double rendimento = saldo * 0.1;
        System.out.println("Seu rendimento é de R$"+rendimento);
    }
    public void exibirInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Número: "+ numero);
        System.out.println("Agência: "+ agencia);
        System.out.println("Saldo R$: "+saldo);
        System.out.println("Data de abertura: "+ dataAbertura);
    }
    //getter and setter
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Identificador
    private int gerarIdentificadorUnico(){
        Random random = new Random();
        int numero = random.nextInt(1000);
        return numero;
    }
    public int getIdentificador(){
        return identificador;
    }
}

