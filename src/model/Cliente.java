package model;

public class Cliente {
	private char cpf;
	private String nome;
	private char telefone;
	private String email;
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
