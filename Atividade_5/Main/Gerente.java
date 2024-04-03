package Main; // Declaração do pacote

public class Gerente extends Funcionario { // Estende a classe Funcionario
    private int funcio_gen;
    private String senha;

    // Construtor
    public Gerente(String nome, String cpf, double salario, int funcio_gen, String senha) {
        super(nome, cpf, salario); // Chama o construtor da superclasse Funcionario
        this.funcio_gen = funcio_gen;
        this.senha = senha;
    }

    // Método para autenticar o gerente
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) { // Usando equals para comparar strings
            System.out.println("Autenticado");
            return true;
        } else {
            System.out.println("Erro na autenticação");
            return false;
        }
    }
    public String getSenha(){
        return this.senha;
    }
    public	double	getBonificacao() {
        return this.salario	*	0.15;
    }

}
