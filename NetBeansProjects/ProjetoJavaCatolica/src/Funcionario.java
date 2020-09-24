

/**
 *
 * @author caio_
 * Projeto final da disciplina de POO-UCB; 
 */
public class Funcionario {

	private String cpf;
        
        private double salario;
        
	private String nome;
	
	private String matricula;

	public Funcionario() {
	}
        
	public Funcionario(String nome, String matricula, String cpf, double salario) {
		
                this.cpf = cpf;
                this.salario = salario;
                this.nome = nome;
		this.matricula = matricula;	
	}
	
        	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getImpostoDeRenda(double salario) {
		return salario;
	}
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
