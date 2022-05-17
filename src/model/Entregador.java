package model;

public class Entregador {
	private int identregador;
	private int idfuncionario;
	private char categoria;
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
