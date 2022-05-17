package model;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendente")
public class Atendente {
	@Id
	@Column(name = "id_atendente")
	@NotNull
	private int id_atendente;
	
	@Id
	@Column(name = "id_funcionario")
	@NotNull
	private Funcionario id_funcionario;
	
	@Column(name = "hora_entrada")
	@NotNull
	private LocalDate hora_entrada;
	
	@Column(name = "hora_saida")
	@NotNull
	private LocalDate hora_saida;
	
	@Column(name = "email")
	@NotNull
	private String email;
	
	public int getId_atendente() {
		return id_atendente;
	}
	public void setId_atendente(int id_atendente) {
		this.id_atendente = id_atendente;
	}
	public Funcionario getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(Funcionario id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public LocalDate getHora_entrada() {
		return hora_entrada;
	}
	public void setHora_entrada(LocalDate hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public LocalDate getHora_saida() {
		return hora_saida;
	}
	public void setHora_saida(LocalDate hora_saida) {
		this.hora_saida = hora_saida;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Atendimento [id_atendente=" + id_atendente + ", id_funcionario=" + id_funcionario + ", hora_entrada="
				+ hora_entrada + ", hora_saida=" + hora_saida + ", email=" + email + "]";
	}
}
