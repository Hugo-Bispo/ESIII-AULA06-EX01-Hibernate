package model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "cpf", length = 11)
	@NotNull
	private char cpf;
	
	@Column(name = "nome", length = 50)
	@NotNull
	private String nome;
	
	@Column(name = "telefone", length = 11)
	@NotNull
	private char telefone;
	
	@Column(name = "email")
	@NotNull
	private String email;
	
	@Column(name = "apelido", length = 20)
	private char apelido;
	public char getCpf() {
		return cpf;
	}
	public void setCpf(char cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTelefone() {
		return telefone;
	}
	public void setTelefone(char telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getApelido() {
		return apelido;
	}
	public void setApelido(char apelido) {
		this.apelido = apelido;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", apelido="
				+ apelido + "]";
	}
	
}
