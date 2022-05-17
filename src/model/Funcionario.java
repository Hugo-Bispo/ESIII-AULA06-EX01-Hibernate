package model;

import java.time.LocalDate;

public class Funcionario {
	private int id;
	private String nome;
	private LocalDate datanascimento;
	private double salario;
	private char telefone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public char getTelefone() {
		return telefone;
	}
	public void setTelefone(char telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", datanascimento=" + datanascimento + ", salario="
				+ salario + ", telefone=" + telefone + "]";
	}
	
}
