package model;

import java.time.LocalDate;

public class Atendimento {
	private int id_atendente;
	private int id_funcionario;
	private LocalDate data_hora;
	public int getId_atendente() {
		return id_atendente;
	}
	public void setId_atendente(int id_atendente) {
		this.id_atendente = id_atendente;
	}
	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public LocalDate getData_hora() {
		return data_hora;
	}
	public void setData_hora(LocalDate data_hora) {
		this.data_hora = data_hora;
	}
	
	@Override
	public String toString() {
		return "Atendimento [id_atendente=" + id_atendente + ", id_funcionario=" + id_funcionario + ", data_hora="
				+ data_hora + "]";
	}
	

}
