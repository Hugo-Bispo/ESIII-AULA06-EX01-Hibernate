package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "entregador")
public class Entregador {
	
	@Id
	@Column(name = "id_entregador")
	@NotNull
	private int identregador;
	
	@Id
	@Column(name = "id_funcionario")
	@NotNull
	private int idfuncionario;
	
	@Column(name = "categoria", length = 2)
	@NotNull
	private char categoria;
	
	@Column(name = "cnh", length = 11)
	@NotNull
	private char cnh;
	public int getIdentregador() {
		return identregador;
	}
	public void setIdentregador(int identregador) {
		this.identregador = identregador;
	}
	public int getIdfuncionario() {
		return idfuncionario;
	}
	public void setIdfuncionario(int idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public char getCategoria() {
		return categoria;
	}
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	public char getCnh() {
		return cnh;
	}
	public void setCnh(char cnh) {
		this.cnh = cnh;
	}
	@Override
	public String toString() {
		return "Entregador [identregador=" + identregador + ", idfuncionario=" + idfuncionario + ", categoria="
				+ categoria + ", cnh=" + cnh + "]";
	}
	
	
}
