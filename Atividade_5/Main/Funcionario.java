
package Main;

public class Funcionario {
    //atributos
    protected String nome;
    protected String cpf;
    protected double salario;

    //construtor
    public Funcionario(String nome, String cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public	double	getBonificacao() {
        return this.salario	*	0.10;
    }

}
