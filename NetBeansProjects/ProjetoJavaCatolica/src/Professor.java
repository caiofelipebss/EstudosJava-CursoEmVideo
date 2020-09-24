/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caio_
 */
public class Professor extends Funcionario {
    
	private String anoDeAdmissao;

	public Professor() {
	}
	
	public Professor(String nome, String matricula, String cpf, double salario) {
		super(nome, matricula, cpf, salario);
	}

	public String getAnoDeAdmissao() {
		return anoDeAdmissao;
	}

	public void setAnoDeAdmissao(String anoDeAdmissao) {
		this.anoDeAdmissao = anoDeAdmissao;
	}

	@Override
	public double getImpostoDeRenda(double salario) {
		return super.getImpostoDeRenda(salario * 0.20);
	}

	@Override
	public String toString() {
		return "\n Nome: " + getNome() + "\nAno de Admissao: " + anoDeAdmissao + "\nMatricula: "
				+ getMatricula() + "\nCpf: " + getCpf() + "\nSalario: " + getSalario()+ "\n";
	}	
}