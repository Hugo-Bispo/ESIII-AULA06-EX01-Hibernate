package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@Column(name = "id_funcionario")
	@NotNull
	private int id;
	
	@Column(name = "nome_funcionario", length = 50)
	@NotNull
	private String nome;
	
	@Column(name = "funcionario_datanascimento")
	@NotNull
	private LocalDate datanascimento;
	
	@Column(name = "salario")
	@NotNull
	private double salario;
	
	@Column(name = "telefone", length = 11)
	@NotNull
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
