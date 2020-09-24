/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caio_
 */
public class Diretor extends Funcionario {

	private int tempoDeCasa;
	
	public Diretor() {
	}
	
	public Diretor(String nome, String matricula, String cpf, double salario) {
		super(nome, matricula, cpf, salario);
	}

	
	public int getTempoDeCasa() {
		return tempoDeCasa;
	}



	public void setTempoDeCasa(int tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}

	@Override
	public double getImpostoDeRenda(double salario) {
		return super.getImpostoDeRenda(salario * 0.23);
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nTempo de Casa: " + tempoDeCasa + "\nMatricula: " + getMatricula()
				+ "\nCpf: " + getCpf() + "\nSalario: " + getSalario()+ "\n";
	}
	
}
